package typings.checCommerceJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object productAttributeOptionMod {
  
  trait ProductAttributeOption extends StObject {
    
    var label: String
    
    var value: String
  }
  object ProductAttributeOption {
    
    inline def apply(label: String, value: String): ProductAttributeOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductAttributeOption]
    }
    
    extension [Self <: ProductAttributeOption](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
