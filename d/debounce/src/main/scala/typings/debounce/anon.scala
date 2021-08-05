package typings.debounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    def clear(): Unit
    
    def flush(): Unit
  }
  object Clear {
    
    inline def apply(clear: () => Unit, flush: () => Unit): Clear = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[Clear]
    }
    
    extension [Self <: Clear](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
}
