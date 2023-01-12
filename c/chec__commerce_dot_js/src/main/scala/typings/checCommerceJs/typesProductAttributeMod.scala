package typings.checCommerceJs

import typings.checCommerceJs.typesProductAttributeOptionMod.ProductAttributeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProductAttributeMod {
  
  trait ProductAttribute extends StObject {
    
    var id: String
    
    var meta: Any
    
    var name: String
    
    var value: String | Double | js.Array[ProductAttributeOption] | Null
  }
  object ProductAttribute {
    
    inline def apply(id: String, meta: Any, name: String): ProductAttribute = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[ProductAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductAttribute] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double | js.Array[ProductAttributeOption]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: ProductAttributeOption*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
