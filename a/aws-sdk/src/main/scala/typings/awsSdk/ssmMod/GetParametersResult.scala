package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParametersResult extends js.Object {
  /**
    * A list of parameters that are not formatted correctly or do not run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.native
}

object GetParametersResult {
  @scala.inline
  def apply(InvalidParameters: ParameterNameList = null, Parameters: ParameterList = null): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidParameters != null) __obj.updateDynamic("InvalidParameters")(InvalidParameters.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersResult]
  }
}

