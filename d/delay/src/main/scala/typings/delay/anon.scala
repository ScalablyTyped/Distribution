package typings.delay

import typings.delay.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearTimeout extends StObject {
    
    def clearTimeout(timeoutId: Any): Unit
    
    def setTimeout(callback: js.Function1[/* repeated */ Any, Unit], milliseconds: Double, args: Any*): Any
  }
  object ClearTimeout {
    
    inline def apply(
      clearTimeout: Any => Unit,
      setTimeout: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Any
    ): ClearTimeout = {
      val __obj = js.Dynamic.literal(clearTimeout = js.Any.fromFunction1(clearTimeout), setTimeout = js.Any.fromFunction3(setTimeout))
      __obj.asInstanceOf[ClearTimeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearTimeout] (val x: Self) extends AnyVal {
      
      inline def setClearTimeout(value: Any => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](milliseconds: Double): js.Promise[T] = js.native
    def apply[T](milliseconds: Double, options: Options[T]): js.Promise[T] = js.native
  }
}
