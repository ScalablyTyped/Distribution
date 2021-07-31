package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFields extends StObject {
  
  var card: js.Any
  
  var hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields
  
  var mobile: js.Any
}
object HostedFields {
  
  @scala.inline
  def apply(card: js.Any, hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields, mobile: js.Any): HostedFields = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFields]
  }
  
  @scala.inline
  implicit class HostedFieldsMutableBuilder[Self <: HostedFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: js.Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedFields(value: typings.braintreeWeb.hostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: js.Any): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
