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
  def apply(Labels: ParameterLabelList, Name: PSParameterName): LabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelParameterVersionRequest]
  }
  @scala.inline
  implicit class LabelParameterVersionRequestOps[Self <: LabelParameterVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLabelsVarargs(value: ParameterLabel*): Self = this.set("Labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: ParameterLabelList): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: PSParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterVersion(value: PSParameterVersion): Self = this.set("ParameterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterVersion: Self = this.set("ParameterVersion", js.undefined)
  }
  
}

