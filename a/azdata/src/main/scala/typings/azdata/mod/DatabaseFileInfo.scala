package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseFileInfo extends StObject {
  
  var id: String
  
  var isSelected: Boolean
  
  var properties: js.Array[LocalizedPropertyInfo]
}
object DatabaseFileInfo {
  
  inline def apply(id: String, isSelected: Boolean, properties: js.Array[LocalizedPropertyInfo]): DatabaseFileInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseFileInfo]
  }
  
  extension [Self <: DatabaseFileInfo](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[LocalizedPropertyInfo]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: LocalizedPropertyInfo*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
