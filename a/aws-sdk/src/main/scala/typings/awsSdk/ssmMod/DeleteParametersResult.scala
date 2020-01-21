package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParametersResult extends js.Object {
  /**
    * The names of the deleted parameters.
    */
  var DeletedParameters: js.UndefOr[ParameterNameList] = js.native
  /**
    * The names of parameters that weren't deleted because the parameters are not valid.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.native
}

object DeleteParametersResult {
  @scala.inline
  def apply(DeletedParameters: ParameterNameList = null, InvalidParameters: ParameterNameList = null): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    if (DeletedParameters != null) __obj.updateDynamic("DeletedParameters")(DeletedParameters.asInstanceOf[js.Any])
    if (InvalidParameters != null) __obj.updateDynamic("InvalidParameters")(InvalidParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersResult]
  }
}

