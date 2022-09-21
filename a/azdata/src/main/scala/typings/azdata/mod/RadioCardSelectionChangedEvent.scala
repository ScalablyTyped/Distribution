package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioCardSelectionChangedEvent extends StObject {
  
  var card: RadioCard
  
  var cardId: String
}
object RadioCardSelectionChangedEvent {
  
  inline def apply(card: RadioCard, cardId: String): RadioCardSelectionChangedEvent = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioCardSelectionChangedEvent]
  }
  
  extension [Self <: RadioCardSelectionChangedEvent](x: Self) {
    
    inline def setCard(value: RadioCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
  }
}
