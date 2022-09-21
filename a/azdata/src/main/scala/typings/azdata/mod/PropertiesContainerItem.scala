package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesContainerItem extends StObject {
  
  /**
    * The name of the property to display
    */
  var displayName: String
  
  /**
    * The value of the property to display
    */
  var value: String
}
object PropertiesContainerItem {
  
  inline def apply(displayName: String, value: String): PropertiesContainerItem = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesContainerItem]
  }
  
  extension [Self <: PropertiesContainerItem](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
