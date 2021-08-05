package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseOfferingRequest extends StObject {
  
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.undefined
  
  /**
    * The ID of the offering promotion to be applied to the purchase.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
  
  /**
    * The number of device slots to purchase in an offering request.
    */
  var quantity: js.UndefOr[Integer] = js.undefined
}
object PurchaseOfferingRequest {
  
  inline def apply(): PurchaseOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseOfferingRequest]
  }
  
  extension [Self <: PurchaseOfferingRequest](x: Self) {
    
    inline def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    inline def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "offeringPromotionId", value.asInstanceOf[js.Any])
    
    inline def setOfferingPromotionIdUndefined: Self = StObject.set(x, "offeringPromotionId", js.undefined)
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
