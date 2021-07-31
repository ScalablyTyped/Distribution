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
  
  @scala.inline
  def apply(): MerchantBusinessRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantBusinessRequest]
  }
  
  @scala.inline
  implicit class MerchantBusinessRequestMutableBuilder[Self <: MerchantBusinessRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: MerchantAddressDetails): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setDbaName(value: String): Self = StObject.set(x, "dbaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbaNameUndefined: Self = StObject.set(x, "dbaName", js.undefined)
    
    @scala.inline
    def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    
    @scala.inline
    def setTaxId(value: String): Self = StObject.set(x, "taxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxIdUndefined: Self = StObject.set(x, "taxId", js.undefined)
  }
}
