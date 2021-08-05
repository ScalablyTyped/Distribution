package typings.delay

import typings.delay.mod.AbortSignal
import typings.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearTimeout extends StObject {
    
    def clearTimeout(): Unit
    def clearTimeout(handle: Double): Unit
    @JSName("clearTimeout")
    var clearTimeout_Original: FnCall
    
    def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double
    def setTimeout(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double
    @JSName("setTimeout")
    var setTimeout_Original: FnCallHandlerTimeoutArguments
  }
  object ClearTimeout {
    
    inline def apply(clearTimeout: FnCall, setTimeout: FnCallHandlerTimeoutArguments): ClearTimeout = {
      val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearTimeout]
    }
    
    extension [Self <: ClearTimeout](x: Self) {
      
      inline def setClearTimeout(value: FnCall): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      inline def setSetTimeout(value: FnCallHandlerTimeoutArguments): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Unit = js.native
    def apply(handle: Double): Unit = js.native
  }
  
  @js.native
  trait FnCallHandlerTimeoutArguments extends StObject {
    
    def apply(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
    def apply(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double = js.native
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
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object Optionsvalueunknownundefi {
    
    inline def apply(): Optionsvalueunknownundefi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsvalueunknownundefi]
    }
    
    extension [Self <: Optionsvalueunknownundefi](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
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
