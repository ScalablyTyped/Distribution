package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeIcomputecontextMod {
  
  trait IComputeContext extends StObject {
    
    def clear(): Unit
  }
  object IComputeContext {
    
    inline def apply(clear: () => Unit): IComputeContext = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[IComputeContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IComputeContext] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
}
