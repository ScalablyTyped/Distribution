package typings.delay

import typings.delay.mod.AbortSignal
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
    
    extension [Self <: ClearTimeout](x: Self) {
      
      inline def setClearTimeout(value: Any => Unit): Self = StObject.set(x, "clearTimeout", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: (js.Function1[/* repeated */ Any, Unit], Double, /* repeated */ Any) => Any): Self = StObject.set(x, "setTimeout", js.Any.fromFunction3(value))
    }
  }
  
  trait Once extends StObject {
    
    var once: js.UndefOr[Boolean] = js.undefined
  }
  object Once {
    
    inline def apply(): Once = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Once]
    }
    
    extension [Self <: Once](x: Self) {
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    }
  }
  
  /* Inlined delay.delay.Options & {  value :unknown | undefined} */
  trait Optionsvalueunknownundefi extends StObject {
    
    /**
    		An optional AbortSignal to abort the delay.
    		If aborted, the Promise will be rejected with an AbortError.
    		*/
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
    			Value to reject in the returned promise.
    			*/
    var value: js.UndefOr[Any] = js.undefined
  }
  object Optionsvalueunknownundefi {
    
    inline def apply(): Optionsvalueunknownundefi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsvalueunknownundefi]
    }
    
    extension [Self <: Optionsvalueunknownundefi](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Value[T] extends StObject {
    
    /**
    			Value to resolve in the returned promise.
    			*/
    var value: T
  }
  object Value {
    
    inline def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    extension [Self <: Value[?], T](x: Self & Value[T]) {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
