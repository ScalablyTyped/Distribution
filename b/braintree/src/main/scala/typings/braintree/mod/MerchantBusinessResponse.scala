package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantBusinessResponse extends StObject {
  
  var addressDetails: js.UndefOr[MerchantAddressDetails] = js.native
  
  var dbaName: js.UndefOr[String] = js.native
  
  var legalName: js.UndefOr[String] = js.native
  
  var taxId: js.UndefOr[String] = js.native
}
object MerchantBusinessResponse {
  
  @scala.inline
  def apply(): MerchantBusinessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantBusinessResponse]
  }
  
  @scala.inline
  implicit class MerchantBusinessResponseMutableBuilder[Self <: MerchantBusinessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressDetails(value: MerchantAddressDetails): Self = StObject.set(x, "addressDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressDetailsUndefined: Self = StObject.set(x, "addressDetails", js.undefined)
    
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
