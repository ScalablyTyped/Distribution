package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewOfferingRequest extends js.Object {
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object RenewOfferingRequest {
  @scala.inline
  def apply(): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingRequest]
  }
  @scala.inline
  implicit class RenewOfferingRequestOps[Self <: RenewOfferingRequest] (val x: Self) extends AnyVal {
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
    def setOfferingId(value: OfferingIdentifier): Self = this.set("offeringId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingId: Self = this.set("offeringId", js.undefined)
    @scala.inline
    def setQuantity(value: Integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

