package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrustRequest extends js.Object {
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[typings.awsSdk.directoryserviceMod.DeleteAssociatedConditionalForwarder] = js.native
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typings.awsSdk.directoryserviceMod.TrustId = js.native
}

object DeleteTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
  @scala.inline
  implicit class DeleteTrustRequestOps[Self <: DeleteTrustRequest] (val x: Self) extends AnyVal {
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
    def setTrustId(value: TrustId): Self = this.set("TrustId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteAssociatedConditionalForwarder(value: DeleteAssociatedConditionalForwarder): Self = this.set("DeleteAssociatedConditionalForwarder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteAssociatedConditionalForwarder: Self = this.set("DeleteAssociatedConditionalForwarder", js.undefined)
  }
  
}

