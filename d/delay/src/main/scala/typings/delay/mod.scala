package typings.delay

import typings.delay.anon.ClearTimeout
import typings.delay.anon.FnCall
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](milliseconds: Double): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def default[T](milliseconds: Double, options: Options[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def clearDelay(delayPromise: js.Promise[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDelay")(delayPromise.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createDelay(timers: ClearTimeout): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("createDelay")(timers.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  inline def rangeDelay[T](minimum: Double, maximum: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeDelay")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  inline def rangeDelay[T](minimum: Double, maximum: Double, options: Options[T]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeDelay")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait Options[T] extends StObject {
    
    /**
    	An `AbortSignal` to abort the delay.
    	The returned promise will be rejected with an `AbortError` if the signal is aborted.
    	@example
    	```
    	import delay from 'delay';
    	const abortController = new AbortController();
    	setTimeout(() => {
    		abortController.abort();
    	}, 500);
    	try {
    		await delay(1000, {signal: abortController.signal});
    	} catch (error) {
    		// 500 milliseconds later
    		console.log(error.name)
    		//=> 'AbortError'
    	}
    	```
    	*/
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
    	A value to resolve in the returned promise.
    	@example
    	```
    	import delay from 'delay';
    	const result = await delay(100, {value: '🦄'});
    	// Executed after 100 milliseconds
    	console.log(result);
    	//=> '🦄'
    	```
    	*/
    var value: js.UndefOr[T] = js.undefined
  }
  object Options {
    
    inline def apply[T](): Options[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options[?], T] (val x: Self & Options[T]) extends AnyVal {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
