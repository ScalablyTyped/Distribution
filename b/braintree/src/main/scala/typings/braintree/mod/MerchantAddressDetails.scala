package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantAddressDetails extends StObject {
  
  var locality: String
  
  var postalCode: String
  
  var region: String
  
  var streetAddress: String
}
object MerchantAddressDetails {
  
  @scala.inline
  def apply(locality: String, postalCode: String, region: String, streetAddress: String): MerchantAddressDetails = {
    val __obj = js.Dynamic.literal(locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAddressDetails]
  }
  
  @scala.inline
  implicit class MerchantAddressDetailsMutableBuilder[Self <: MerchantAddressDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
  }
}
