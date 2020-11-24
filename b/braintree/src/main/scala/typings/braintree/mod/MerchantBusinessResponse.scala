package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MerchantBusinessResponse extends js.Object {
  
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
  implicit class MerchantBusinessResponseOps[Self <: MerchantBusinessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddressDetails(value: MerchantAddressDetails): Self = this.set("addressDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressDetails: Self = this.set("addressDetails", js.undefined)
    
    @scala.inline
    def setDbaName(value: String): Self = this.set("dbaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbaName: Self = this.set("dbaName", js.undefined)
    
    @scala.inline
    def setLegalName(value: String): Self = this.set("legalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalName: Self = this.set("legalName", js.undefined)
    
    @scala.inline
    def setTaxId(value: String): Self = this.set("taxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxId: Self = this.set("taxId", js.undefined)
  }
}
