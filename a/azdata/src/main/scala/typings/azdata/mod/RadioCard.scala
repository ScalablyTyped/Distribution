package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioCard extends StObject {
  
  /**
    * descriptions to be displayed in the card.
    */
  var descriptions: js.Array[RadioCardDescription]
  
  /**
    * Icon of the card.
    */
  var icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * Id of the card.
    */
  var id: String
}
object RadioCard {
  
  inline def apply(descriptions: js.Array[RadioCardDescription], id: String): RadioCard = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioCard] (val x: Self) extends AnyVal {
    
    inline def setDescriptions(value: js.Array[RadioCardDescription]): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsVarargs(value: RadioCardDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setIcon(value: IconPath): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
