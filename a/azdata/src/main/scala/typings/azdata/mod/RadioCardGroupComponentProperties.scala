package typings.azdata.mod

import typings.azdata.azdataStrings.left
import typings.azdata.azdataStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioCardGroupComponentProperties
  extends StObject
     with TitledComponentProperties {
  
  /**
    * Height of the card.
    */
  var cardHeight: String
  
  /**
    * Width of the card.
    */
  var cardWidth: String
  
  /**
    * Cards information.
    */
  var cards: js.Array[RadioCard]
  
  /**
    * Height of the icon.
    */
  var iconHeight: js.UndefOr[String] = js.undefined
  
  /**
    * Position of the icon. Default value is top.
    */
  var iconPosition: js.UndefOr[top | left] = js.undefined
  
  /**
    * Width of the icon.
    */
  var iconWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Oritentation of the cards in the group. Default value is horizontal.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  /**
    * Id of the currently selected card.
    */
  var selectedCardId: js.UndefOr[String] = js.undefined
}
object RadioCardGroupComponentProperties {
  
  inline def apply(cardHeight: String, cardWidth: String, cards: js.Array[RadioCard]): RadioCardGroupComponentProperties = {
    val __obj = js.Dynamic.literal(cardHeight = cardHeight.asInstanceOf[js.Any], cardWidth = cardWidth.asInstanceOf[js.Any], cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioCardGroupComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioCardGroupComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setCardHeight(value: String): Self = StObject.set(x, "cardHeight", value.asInstanceOf[js.Any])
    
    inline def setCardWidth(value: String): Self = StObject.set(x, "cardWidth", value.asInstanceOf[js.Any])
    
    inline def setCards(value: js.Array[RadioCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCardsVarargs(value: RadioCard*): Self = StObject.set(x, "cards", js.Array(value*))
    
    inline def setIconHeight(value: String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconPosition(value: top | left): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    inline def setIconWidth(value: String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSelectedCardId(value: String): Self = StObject.set(x, "selectedCardId", value.asInstanceOf[js.Any])
    
    inline def setSelectedCardIdUndefined: Self = StObject.set(x, "selectedCardId", js.undefined)
  }
}
