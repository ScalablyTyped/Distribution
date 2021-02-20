package typings.debounceFn

import typings.debounceFn.debounceFnBooleans.`false`
import typings.debounceFn.debounceFnBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("debounce-fn", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType]): DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]] = js.native
  /**
  [Debounce](https://davidwalsh.name/javascript-debounce-function) a function.
  @param input - Function to debounce.
  @returns A debounced function that delays calling the `input` function until after `wait` milliseconds have elapsed since the last time the debounced function was called.
  It comes with a `.cancel()` method to cancel any scheduled `input` function calls.
  @example
  ```
  import debounceFn = require('debounce-fn');
  window.onresize = debounceFn(() => {
  	// Do something on window resize
  }, {wait: 100});
  ```
  */
  @JSImport("debounce-fn", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: BeforeOptions): DebouncedFunction[ArgumentsType, ReturnType] = js.native
  @JSImport("debounce-fn", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: NoBeforeNoAfterOptions): DebouncedFunction[ArgumentsType, js.UndefOr[scala.Nothing]] = js.native
  @JSImport("debounce-fn", JSImport.Namespace)
  @js.native
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]] = js.native
  
  @js.native
  trait BeforeOptions extends Options {
    
    @JSName("before")
    val before_BeforeOptions: `true` = js.native
  }
  object BeforeOptions {
    
    @scala.inline
    def apply(before: `true`): BeforeOptions = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeOptions]
    }
    
    @scala.inline
    implicit class BeforeOptionsMutableBuilder[Self <: BeforeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: `true`): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DebouncedFunction[ArgumentsType /* <: js.Array[_] */, ReturnType] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
    ): ReturnType = js.native
    
    def cancel(): Unit = js.native
  }
  
  @js.native
  trait NoBeforeNoAfterOptions extends Options {
    
    @JSName("after")
    val after_NoBeforeNoAfterOptions: `false` = js.native
    
    @JSName("before")
    val before_NoBeforeNoAfterOptions: js.UndefOr[`false`] = js.native
  }
  object NoBeforeNoAfterOptions {
    
    @scala.inline
    def apply(after: `false`): NoBeforeNoAfterOptions = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoBeforeNoAfterOptions]
    }
    
    @scala.inline
    implicit class NoBeforeNoAfterOptionsMutableBuilder[Self <: NoBeforeNoAfterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: `false`): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: `false`): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Trigger the function on the trailing edge of the `wait` interval.
    		@default true
    		*/
    val after: js.UndefOr[Boolean] = js.native
    
    /**
    		Trigger the function on the leading edge of the `wait` interval.
    		For example, this can be useful for preventing accidental double-clicks on a "submit" button from firing a second time.
    		@default false
    		*/
    val before: js.UndefOr[Boolean] = js.native
    
    /**
    		Time to wait until the `input` function is called.
    		@default 0
    		*/
    @JSName("wait")
    val wait_FOptions: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Boolean): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
