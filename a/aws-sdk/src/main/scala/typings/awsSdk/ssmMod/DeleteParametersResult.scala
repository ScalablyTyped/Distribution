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
  def apply(): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParametersResult]
  }
  @scala.inline
  implicit class DeleteParametersResultOps[Self <: DeleteParametersResult] (val x: Self) extends AnyVal {
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
    def setDeletedParametersVarargs(value: PSParameterName*): Self = this.set("DeletedParameters", js.Array(value :_*))
    @scala.inline
    def setDeletedParameters(value: ParameterNameList): Self = this.set("DeletedParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedParameters: Self = this.set("DeletedParameters", js.undefined)
    @scala.inline
    def setInvalidParametersVarargs(value: PSParameterName*): Self = this.set("InvalidParameters", js.Array(value :_*))
    @scala.inline
    def setInvalidParameters(value: ParameterNameList): Self = this.set("InvalidParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidParameters: Self = this.set("InvalidParameters", js.undefined)
  }
  
}

