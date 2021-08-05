package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenewOfferingRequest extends StObject {
  
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.undefined
  
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: js.UndefOr[Integer] = js.undefined
}
object RenewOfferingRequest {
  
  inline def apply(): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewOfferingRequest]
  }
  
  extension [Self <: RenewOfferingRequest](x: Self) {
    
    inline def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    inline def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
