package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalizedPropertyInfo extends StObject {
  
  var propertyDisplayName: String
  
  var propertyName: String
  
  var propertyValue: String
  
  var propertyValueDisplayName: String
}
object LocalizedPropertyInfo {
  
  inline def apply(
    propertyDisplayName: String,
    propertyName: String,
    propertyValue: String,
    propertyValueDisplayName: String
  ): LocalizedPropertyInfo = {
    val __obj = js.Dynamic.literal(propertyDisplayName = propertyDisplayName.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], propertyValue = propertyValue.asInstanceOf[js.Any], propertyValueDisplayName = propertyValueDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedPropertyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalizedPropertyInfo] (val x: Self) extends AnyVal {
    
    inline def setPropertyDisplayName(value: String): Self = StObject.set(x, "propertyDisplayName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyValue(value: String): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
    
    inline def setPropertyValueDisplayName(value: String): Self = StObject.set(x, "propertyValueDisplayName", value.asInstanceOf[js.Any])
  }
}
