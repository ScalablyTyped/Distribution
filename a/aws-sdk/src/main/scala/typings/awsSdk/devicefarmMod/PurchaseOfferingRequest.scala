package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingRequest extends js.Object {
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.native
  /**
    * The number of device slots to purchase in an offering request.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object PurchaseOfferingRequest {
  @scala.inline
  def apply(): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  @scala.inline
  implicit class PurchaseOfferingRequestOps[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
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
    def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = this.set("offeringPromotionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferingPromotionId: Self = this.set("offeringPromotionId", js.undefined)
    @scala.inline
    def setQuantity(value: Integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

