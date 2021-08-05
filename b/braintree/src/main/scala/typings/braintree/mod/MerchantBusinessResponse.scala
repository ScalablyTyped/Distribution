package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantBusinessResponse extends StObject {
  
  var addressDetails: js.UndefOr[MerchantAddressDetails] = js.undefined
  
  var dbaName: js.UndefOr[String] = js.undefined
  
  var legalName: js.UndefOr[String] = js.undefined
  
  var taxId: js.UndefOr[String] = js.undefined
}
object MerchantBusinessResponse {
  
  inline def apply(): MerchantBusinessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantBusinessResponse]
  }
  
  extension [Self <: MerchantBusinessResponse](x: Self) {
    
    inline def setAddressDetails(value: MerchantAddressDetails): Self = StObject.set(x, "addressDetails", value.asInstanceOf[js.Any])
    
    inline def setAddressDetailsUndefined: Self = StObject.set(x, "addressDetails", js.undefined)
    
    inline def setDbaName(value: String): Self = StObject.set(x, "dbaName", value.asInstanceOf[js.Any])
    
    inline def setDbaNameUndefined: Self = StObject.set(x, "dbaName", js.undefined)
    
    inline def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
    
    inline def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    
    inline def setTaxId(value: String): Self = StObject.set(x, "taxId", value.asInstanceOf[js.Any])
    
    inline def setTaxIdUndefined: Self = StObject.set(x, "taxId", js.undefined)
  }
}
