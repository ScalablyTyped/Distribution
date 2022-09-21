package typings.delay

import typings.delay.anon.ClearTimeout
import typings.delay.anon.Once
import typings.delay.anon.Optionsvalueunknownundefi
import typings.delay.anon.Value
import typings.delay.delayStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined delay.delay.Delay & {createWithTimers (timers : {clearTimeout (timeoutId : any): void, setTimeout (callback : (args : ...any): void, milliseconds : number, args : ...any): unknown}): delay.delay.Delay,   default :/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay * / any} */
object mod {
  
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  inline def apply(milliseconds: Double): ClearablePromise[Unit] = ^.asInstanceOf[js.Dynamic].apply(milliseconds.asInstanceOf[js.Any]).asInstanceOf[ClearablePromise[Unit]]
  inline def apply(milliseconds: Double, options: Options): ClearablePromise[Unit] = (^.asInstanceOf[js.Dynamic].apply(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[Unit]]
  inline def apply[T](milliseconds: Double, options: Options & Value[T]): ClearablePromise[T] = (^.asInstanceOf[js.Dynamic].apply(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[T]]
  
  @JSImport("delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release.
  @JSImport("delay", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ Any = js.native
  
  // The types are intentionally loose to make it work with both Node.js and browser versions of these methods.
  inline def createWithTimers(timers: ClearTimeout): Delay = ^.asInstanceOf[js.Dynamic].applyDynamic("createWithTimers")(timers.asInstanceOf[js.Any]).asInstanceOf[Delay]
  
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Create a promise which resolves after a random amount of milliseconds between `minimum` and `maximum` has passed.
  	Useful for tests and web scraping since they can have unpredictable performance. For example, if you have a test that asserts a method should not take longer than a certain amount of time, and then run it on a CI, it could take longer. So with `.range()`, you could give it a threshold instead.
  	@param minimum - Minimum amount of milliseconds to delay the promise.
  	@param maximum - Maximum amount of milliseconds to delay the promise.
  	@returns A promise which resolves after a random amount of milliseconds between `maximum` and `maximum` has passed.
  	*/
  inline def range[T](minimum: Double, maximum: Double): ClearablePromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[T]]
  inline def range[T](minimum: Double, maximum: Double, options: Options & Value[T]): ClearablePromise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[T]]
  
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 is resolved.
  /**
  	Create a promise which rejects after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which rejects after the specified `milliseconds`.
  	*/
  inline def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("reject")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[ClearablePromise[scala.Nothing]]
  inline def reject(milliseconds: Double, options: Optionsvalueunknownundefi): ClearablePromise[scala.Nothing] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(milliseconds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClearablePromise[scala.Nothing]]
  
  /**
  	Minimal subset of `AbortSignal` that delay will use if passed.
  	This avoids a dependency on dom.d.ts.
  	The dom.d.ts `AbortSignal` is compatible with this one.
  	*/
  @js.native
  trait AbortSignal extends StObject {
    
    val aborted: Boolean = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.Function0[Unit], options: Once): Unit = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait ClearablePromise[T]
    extends js.Promise[T] {
    
    /**
    		Clears the delay and settles the promise.
    		*/
    def clear(): Unit = js.native
  }
  
  @js.native
  trait Delay extends StObject {
    
    /**
    	Create a promise which resolves after the specified `milliseconds`.
    	@param milliseconds - Milliseconds to delay the promise.
    	@returns A promise which resolves after the specified `milliseconds`.
    	*/
    def apply(milliseconds: Double): ClearablePromise[Unit] = js.native
    def apply(milliseconds: Double, options: Options): ClearablePromise[Unit] = js.native
    def apply[T](milliseconds: Double, options: Options & Value[T]): ClearablePromise[T] = js.native
    
    /**
    	Create a promise which resolves after a random amount of milliseconds between `minimum` and `maximum` has passed.
    	Useful for tests and web scraping since they can have unpredictable performance. For example, if you have a test that asserts a method should not take longer than a certain amount of time, and then run it on a CI, it could take longer. So with `.range()`, you could give it a threshold instead.
    	@param minimum - Minimum amount of milliseconds to delay the promise.
    	@param maximum - Maximum amount of milliseconds to delay the promise.
    	@returns A promise which resolves after a random amount of milliseconds between `maximum` and `maximum` has passed.
    	*/
    def range[T](minimum: Double, maximum: Double): ClearablePromise[T] = js.native
    def range[T](minimum: Double, maximum: Double, options: Options & Value[T]): ClearablePromise[T] = js.native
    
    // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 is resolved.
    /**
    	Create a promise which rejects after the specified `milliseconds`.
    	@param milliseconds - Milliseconds to delay the promise.
    	@returns A promise which rejects after the specified `milliseconds`.
    	*/
    def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = js.native
    def reject(milliseconds: Double, options: Optionsvalueunknownundefi): ClearablePromise[scala.Nothing] = js.native
  }
  
  trait Options extends StObject {
    
    /**
    		An optional AbortSignal to abort the delay.
    		If aborted, the Promise will be rejected with an AbortError.
    		*/
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
