package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: Any
  
  var hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields
}
object Card {
  
  inline def apply(card: Any, hostedFields: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setHostedFields(value: typings.braintreeWeb.modulesHostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
  }
}
