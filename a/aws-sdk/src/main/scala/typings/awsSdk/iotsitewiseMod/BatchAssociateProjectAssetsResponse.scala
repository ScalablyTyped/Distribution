package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchAssociateProjectAssetsResponse extends js.Object {
  /**
    * A list of associated error information, if any.
    */
  var errors: js.UndefOr[BatchAssociateProjectAssetsErrors] = js.native
}

object BatchAssociateProjectAssetsResponse {
  @scala.inline
  def apply(): BatchAssociateProjectAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchAssociateProjectAssetsResponse]
  }
  @scala.inline
  implicit class BatchAssociateProjectAssetsResponseOps[Self <: BatchAssociateProjectAssetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: AssetErrorDetails*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: BatchAssociateProjectAssetsErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

