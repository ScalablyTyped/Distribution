package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFields extends js.Object {
  
  var card: js.Any = js.native
  
  var hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields = js.native
  
  var mobile: js.Any = js.native
}
object HostedFields {
  
  @scala.inline
  def apply(card: js.Any, hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields, mobile: js.Any): HostedFields = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFields]
  }
  
  @scala.inline
  implicit class HostedFieldsOps[Self <: HostedFields] (val x: Self) extends AnyVal {
    
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
    def setCard(value: js.Any): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedFields(value: typings.braintreeWeb.hostedFieldsMod.HostedFields): Self = this.set("hostedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: js.Any): Self = this.set("mobile", value.asInstanceOf[js.Any])
  }
}
