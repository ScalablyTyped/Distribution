package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenewOfferingRequest extends StObject {
  
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
  implicit class RenewOfferingRequestMutableBuilder[Self <: RenewOfferingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferingId(value: OfferingIdentifier): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
