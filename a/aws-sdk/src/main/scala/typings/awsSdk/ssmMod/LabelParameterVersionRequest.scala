package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelParameterVersionRequest extends js.Object {
  /**
    * One or more labels to attach to the specified parameter version.
    */
  var Labels: ParameterLabelList = js.native
  /**
    * The parameter name on which you want to attach one or more labels.
    */
  var Name: PSParameterName = js.native
  /**
    * The specific version of the parameter on which you want to attach one or more labels. If no version is specified, the system attaches the label to the latest version.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.native
}

object LabelParameterVersionRequest {
  @scala.inline
  def apply(Labels: ParameterLabelList, Name: PSParameterName, ParameterVersion: Int | Double = null): LabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ParameterVersion != null) __obj.updateDynamic("ParameterVersion")(ParameterVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelParameterVersionRequest]
  }
}

