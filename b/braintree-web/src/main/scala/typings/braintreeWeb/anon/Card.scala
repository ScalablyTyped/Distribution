package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: js.Any
  
  var hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields
}
object Card {
  
  inline def apply(card: js.Any, hostedFields: typings.braintreeWeb.hostedFieldsMod.HostedFields): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: js.Any): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setHostedFields(value: typings.braintreeWeb.hostedFieldsMod.HostedFields): Self = StObject.set(x, "hostedFields", value.asInstanceOf[js.Any])
  }
}
