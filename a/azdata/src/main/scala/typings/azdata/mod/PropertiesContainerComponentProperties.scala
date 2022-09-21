package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesContainerComponentProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The properties to display
    */
  var propertyItems: js.UndefOr[js.Array[PropertiesContainerItem]] = js.undefined
  
  /**
    * Whether to show the button that will hide/show the content of the container. Default value is false.
    */
  var showToggleButton: js.UndefOr[Boolean] = js.undefined
}
object PropertiesContainerComponentProperties {
  
  inline def apply(): PropertiesContainerComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertiesContainerComponentProperties]
  }
  
  extension [Self <: PropertiesContainerComponentProperties](x: Self) {
    
    inline def setPropertyItems(value: js.Array[PropertiesContainerItem]): Self = StObject.set(x, "propertyItems", value.asInstanceOf[js.Any])
    
    inline def setPropertyItemsUndefined: Self = StObject.set(x, "propertyItems", js.undefined)
    
    inline def setPropertyItemsVarargs(value: PropertiesContainerItem*): Self = StObject.set(x, "propertyItems", js.Array(value*))
    
    inline def setShowToggleButton(value: Boolean): Self = StObject.set(x, "showToggleButton", value.asInstanceOf[js.Any])
    
    inline def setShowToggleButtonUndefined: Self = StObject.set(x, "showToggleButton", js.undefined)
  }
}
