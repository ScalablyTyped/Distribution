package typings.classTransformer

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeHelpOptionsInterfaceMod {
  
  trait TypeHelpOptions extends StObject {
    
    var newObject: Any
    
    var `object`: Record[String, Any]
    
    var property: String
  }
  object TypeHelpOptions {
    
    inline def apply(newObject: Any, `object`: Record[String, Any], property: String): TypeHelpOptions = {
      val __obj = js.Dynamic.literal(newObject = newObject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHelpOptions]
    }
    
    extension [Self <: TypeHelpOptions](x: Self) {
      
      inline def setNewObject(value: Any): Self = StObject.set(x, "newObject", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Record[String, Any]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
}
