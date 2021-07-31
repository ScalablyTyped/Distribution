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
    
    @scala.inline
    def apply(clearTimeout: FnCall, setTimeout: FnCallHandlerTimeoutArguments): ClearTimeout = {
      val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearTimeout]
    }
    
    @scala.inline
    implicit class ClearTimeoutMutableBuilder[Self <: ClearTimeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTimeout(value: FnCall): Self = StObject.set(x, "clearTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetTimeout(value: FnCallHandlerTimeoutArguments): Self = StObject.set(x, "setTimeout", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): Once = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Once]
    }
    
    @scala.inline
    implicit class OnceMutableBuilder[Self <: Once] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
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
    
    @scala.inline
    def apply(): Optionsvalueunknownundefi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsvalueunknownundefi]
    }
    
    @scala.inline
    implicit class OptionsvalueunknownundefiMutableBuilder[Self <: Optionsvalueunknownundefi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Value[T] extends StObject {
    
    /**
    			Value to resolve in the returned promise.
    			*/
    var value: T
  }
  object Value {
    
    @scala.inline
    def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
