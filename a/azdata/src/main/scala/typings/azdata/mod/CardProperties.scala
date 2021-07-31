package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardProperties
  extends StObject
     with ComponentProperties
     with ComponentWithIcon {
  
  var actions: js.UndefOr[js.Array[ActionDescriptor]] = js.undefined
  
  /**
    * Card Type, default: Details
    */
  var cardType: js.UndefOr[CardType] = js.undefined
  
  var descriptions: js.UndefOr[js.Array[CardDescriptionItem]] = js.undefined
  
  var label: String
  
  /**
    * Returns true if the card is selected
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var status: js.UndefOr[StatusIndicator] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object CardProperties {
  
  @scala.inline
  def apply(label: String): CardProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProperties]
  }
  
  @scala.inline
  implicit class CardPropertiesMutableBuilder[Self <: CardProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ActionDescriptor]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: ActionDescriptor*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCardType(value: CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    @scala.inline
    def setDescriptions(value: js.Array[CardDescriptionItem]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: CardDescriptionItem*): Self = StObject.set(x, "descriptions", js.Array(value :_*))
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusIndicator): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
