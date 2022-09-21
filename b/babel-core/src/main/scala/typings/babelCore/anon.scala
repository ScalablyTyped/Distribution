package typings.babelCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exported extends StObject {
    
    var exported: js.Array[js.Object]
    
    var specifiers: js.Array[js.Object]
  }
  object Exported {
    
    inline def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
      val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exported]
    }
    
    extension [Self <: Exported](x: Self) {
      
      inline def setExported(value: js.Array[js.Object]): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      inline def setExportedVarargs(value: js.Object*): Self = StObject.set(x, "exported", js.Array(value*))
      
      inline def setSpecifiers(value: js.Array[js.Object]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
      
      inline def setSpecifiersVarargs(value: js.Object*): Self = StObject.set(x, "specifiers", js.Array(value*))
    }
  }
  
  trait Loc extends StObject {
    
    var loc: js.Object
    
    var message: String
    
    var `type`: String
  }
  object Loc {
    
    inline def apply(loc: js.Object, message: String, `type`: String): Loc = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loc]
    }
    
    extension [Self <: Loc](x: Self) {
      
      inline def setLoc(value: js.Object): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
