package typings.braintreeWebDropIn.anon

import typings.braintreeWeb.hostedFieldsMod.HostedFieldsField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cvv extends js.Object {
  
  var cvv: js.UndefOr[HostedFieldsField] = js.native
  
  var expirationDate: js.UndefOr[HostedFieldsField] = js.native
  
  var number: js.UndefOr[HostedFieldsField] = js.native
  
  var postalCode: js.UndefOr[HostedFieldsField] = js.native
}
object Cvv {
  
  @scala.inline
  def apply(): Cvv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvv]
  }
  
  @scala.inline
  implicit class CvvOps[Self <: Cvv] (val x: Self) extends AnyVal {
    
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
    def deleteCvv: Self = this.set("cvv", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: HostedFieldsField): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setNumber(value: HostedFieldsField): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setPostalCode(value: HostedFieldsField): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
  }
}
