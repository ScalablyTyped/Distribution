package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantBusinessRequest extends StObject {
  
  var address: js.UndefOr[MerchantAddressDetails] = js.undefined
  
  var dbaName: js.UndefOr[String] = js.undefined
  
  var legalName: js.UndefOr[String] = js.undefined
  
  var taxId: js.UndefOr[String] = js.undefined
}
object MerchantBusinessRequest {
  
  inline def apply(): MerchantBusinessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantBusinessRequest]
  }
  
  extension [Self <: MerchantBusinessRequest](x: Self) {
    
    inline def setAddress(value: MerchantAddressDetails): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDbaName(value: String): Self = StObject.set(x, "dbaName", value.asInstanceOf[js.Any])
    
    inline def setDbaNameUndefined: Self = StObject.set(x, "dbaName", js.undefined)
    
    inline def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
    
    inline def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    
    inline def setTaxId(value: String): Self = StObject.set(x, "taxId", value.asInstanceOf[js.Any])
    
    inline def setTaxIdUndefined: Self = StObject.set(x, "taxId", js.undefined)
  }
}
