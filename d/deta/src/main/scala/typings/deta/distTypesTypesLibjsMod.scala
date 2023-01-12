package typings.deta

import typings.deta.anon.Cron
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesLibjsMod {
  
  trait DetaLib extends StObject {
    
    var lib: Cron
  }
  object DetaLib {
    
    inline def apply(lib: Cron): DetaLib = {
      val __obj = js.Dynamic.literal(lib = lib.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetaLib]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetaLib] (val x: Self) extends AnyVal {
      
      inline def setLib(value: Cron): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
    }
  }
  
  type DetaLibApp = js.Function1[/* app */ Any, Any & DetaLib]
}
