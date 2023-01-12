package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioCardLinkClickEvent extends StObject {
  
  var card: RadioCard
  
  var cardId: String
  
  var description: RadioCardDescription
}
object RadioCardLinkClickEvent {
  
  inline def apply(card: RadioCard, cardId: String, description: RadioCardDescription): RadioCardLinkClickEvent = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioCardLinkClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioCardLinkClickEvent] (val x: Self) extends AnyVal {
    
    inline def setCard(value: RadioCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: RadioCardDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
