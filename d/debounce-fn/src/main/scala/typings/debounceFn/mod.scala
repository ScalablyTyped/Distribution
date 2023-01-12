package typings.debounceFn

import typings.debounceFn.debounceFnBooleans.`false`
import typings.debounceFn.debounceFnBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("debounce-fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType]): DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]]]
  /**
  [Debounce](https://davidwalsh.name/javascript-debounce-function) a function.
  @param input - Function to debounce.
  @returns A debounced function that delays calling the `input` function until after `wait` milliseconds have elapsed since the last time the debounced function was called.
  It comes with a `.cancel()` method to cancel any scheduled `input` function calls.
  @example
  ```
  import debounceFn from 'debounce-fn';
  window.onresize = debounceFn(() => {
  	// Do something on window resize
  }, {wait: 100});
  ```
  */
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: BeforeOptions): DebouncedFunction[ArgumentsType, ReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunction[ArgumentsType, ReturnType]]
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: NoBeforeNoAfterOptions): DebouncedFunction[ArgumentsType, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunction[ArgumentsType, Unit]]
  inline def default[ArgumentsType /* <: js.Array[Any] */, ReturnType](input: js.Function1[/* arguments */ ArgumentsType, ReturnType], options: Options): DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunction[ArgumentsType, js.UndefOr[ReturnType]]]
  
  trait BeforeOptions
    extends StObject
       with Options {
    
    @JSName("before")
    val before_BeforeOptions: `true`
  }
  object BeforeOptions {
    
    inline def apply(): BeforeOptions = {
      val __obj = js.Dynamic.literal(before = true)
      __obj.asInstanceOf[BeforeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeOptions] (val x: Self) extends AnyVal {
      
      inline def setBefore(value: `true`): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DebouncedFunction[ArgumentsType /* <: js.Array[Any] */, ReturnType] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type ArgumentsType is not an array type */ arguments: ArgumentsType
    ): ReturnType = js.native
    
    def cancel(): Unit = js.native
  }
  
  trait NoBeforeNoAfterOptions
    extends StObject
       with Options {
    
    @JSName("after")
    val after_NoBeforeNoAfterOptions: `false`
    
    @JSName("before")
    val before_NoBeforeNoAfterOptions: js.UndefOr[`false`] = js.undefined
  }
  object NoBeforeNoAfterOptions {
    
    inline def apply(): NoBeforeNoAfterOptions = {
      val __obj = js.Dynamic.literal(after = false)
      __obj.asInstanceOf[NoBeforeNoAfterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoBeforeNoAfterOptions] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: `false`): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setBefore(value: `false`): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Trigger the function on the trailing edge of the `wait` interval.
    	@default true
    	*/
    val after: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Trigger the function on the leading edge of the `wait` interval.
    	For example, this can be useful for preventing accidental double-clicks on a "submit" button from firing a second time.
    	@default false
    	*/
    val before: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The maximum time the `input` function is allowed to be delayed before it's invoked.
    	This can be used to control the rate of calls handled in a constant stream. For example, a media player sending updates every few milliseconds but wants to be handled only once a second.
    	@default Infinity
    	*/
    val maxWait: js.UndefOr[Double] = js.undefined
    
    /**
    	Time in milliseconds to wait until the `input` function is called.
    	@default 0
    	*/
    @JSName("wait")
    val wait_FOptions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: Boolean): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: Boolean): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
}
