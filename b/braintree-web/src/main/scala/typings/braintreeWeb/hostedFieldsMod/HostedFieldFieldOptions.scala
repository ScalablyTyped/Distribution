package typings.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldFieldOptions extends js.Object {
  
  var cvv: HostedFieldsField = js.native
  
  var expirationDate: js.UndefOr[HostedFieldsField] = js.native
  
  var expirationMonth: js.UndefOr[HostedFieldsField] = js.native
  
  var expirationYear: js.UndefOr[HostedFieldsField] = js.native
  
  var number: HostedFieldsField = js.native
  
  var postalCode: js.UndefOr[HostedFieldsField] = js.native
}
object HostedFieldFieldOptions {
  
  @scala.inline
  def apply(cvv: HostedFieldsField, number: HostedFieldsField): HostedFieldFieldOptions = {
    val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldFieldOptions]
  }
  
  @scala.inline
  implicit class HostedFieldFieldOptionsOps[Self <: HostedFieldFieldOptions] (val x: Self) extends AnyVal {
    
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
    def setCvv(value: HostedFieldsField): Self = this.set("cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: HostedFieldsField): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDate(value: HostedFieldsField): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: HostedFieldsField): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: HostedFieldsField): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    
    @scala.inline
    def setPostalCode(value: HostedFieldsField): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
  }
}
