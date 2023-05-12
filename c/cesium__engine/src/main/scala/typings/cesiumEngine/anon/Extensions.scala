package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.MetadataComponentType
import typings.cesiumEngine.mod.MetadataEnumValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[Any] = js.undefined
  
  var extras: js.UndefOr[Any] = js.undefined
  
  var id: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var valueType: js.UndefOr[MetadataComponentType] = js.undefined
  
  var values: js.Array[MetadataEnumValue]
}
object Extensions {
  
  inline def apply(id: String, values: js.Array[MetadataEnumValue]): Extensions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtensions(value: Any): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtras(value: Any): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValueType(value: MetadataComponentType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    inline def setValueTypeUndefined: Self = StObject.set(x, "valueType", js.undefined)
    
    inline def setValues(value: js.Array[MetadataEnumValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: MetadataEnumValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
