package typings.createTestServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def get(url: String, response: String): Unit
  }
  object Get {
    
    inline def apply(get: (String, String) => Unit): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: (String, String) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
}
