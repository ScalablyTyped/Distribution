package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSchemaArrayType extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType
  
  var `type`: array
}
object JSONSchemaArrayType {
  
  inline def apply(items: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType): JSONSchemaArrayType = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[JSONSchemaArrayType]
  }
  
  extension [Self <: JSONSchemaArrayType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItems(value: JSONSchemaBasicType | JSONSchemaObjectType | JSONSchemaRefType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
