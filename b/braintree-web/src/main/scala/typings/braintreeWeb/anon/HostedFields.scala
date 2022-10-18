package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFields extends StObject {
  
  var card: Any
  
  var hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields
  
  var mobile: Any
}
object HostedFields {
  
  inline def apply(card: Any, hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields, mobile: Any): HostedFields = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFields]
  }
  
  extension [Self <: HostedFields](x: Self) {
    
    inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setHostedFields(value: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Any): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
  }
}
