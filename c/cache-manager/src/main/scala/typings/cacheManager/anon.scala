package typings.cacheManager

import typings.cacheManager.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create extends StObject {
    
    def create(args: Any*): Store
  }
  object Create {
    
    inline def apply(create: /* repeated */ Any => Store): Create = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[Create]
    }
    
    extension [Self <: Create](x: Self) {
      
      inline def setCreate(value: /* repeated */ Any => Store): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
}
