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
  
  inline def apply(locality: String, postalCode: String, region: String, streetAddress: String): MerchantAddressDetails = {
    val __obj = js.Dynamic.literal(locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAddressDetails]
  }
  
  extension [Self <: MerchantAddressDetails](x: Self) {
    
    inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
  }
}
