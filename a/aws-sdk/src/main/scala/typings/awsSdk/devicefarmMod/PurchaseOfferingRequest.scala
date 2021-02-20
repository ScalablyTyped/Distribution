package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchaseOfferingRequest extends StObject {
  
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
  implicit class PurchaseOfferingRequestMutableBuilder[Self <: PurchaseOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    @scala.inline
    def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "offeringPromotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingPromotionIdUndefined: Self = StObject.set(x, "offeringPromotionId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
