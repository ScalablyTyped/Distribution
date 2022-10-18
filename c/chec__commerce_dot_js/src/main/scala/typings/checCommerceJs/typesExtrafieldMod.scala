package typings.checCommerceJs

import typings.checCommerceJs.checCommerceJsStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExtrafieldMod {
  
  trait Extrafield extends StObject {
    
    var id: String
    
    var name: String
    
    var options: Any
    
    var required: Boolean
    
    var `type`: ExtrafieldType
  }
  object Extrafield {
    
    inline def apply(id: String, name: String, options: Any, required: Boolean, `type`: ExtrafieldType): Extrafield = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extrafield]
    }
    
    extension [Self <: Extrafield](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setType(value: ExtrafieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtrafieldType = text
}
