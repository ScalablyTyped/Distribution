package typings.delay

import typings.delay.anon.ClearTimeout
import typings.delay.anon.Once
import typings.delay.anon.Optionsvalueunknownundefi
import typings.delay.anon.Value
import typings.delay.delayStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined delay.delay.Delay & {createWithTimers (timers : {  clearTimeout :{None (handle : number): void, None (): void},   setTimeout :{None (handler : std.TimerHandler, timeout : undefined, arguments : ...any): number, None (handler : std.TimerHandler, timeout : number, arguments : ...any): number}}): delay.delay.Delay,   default :/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay * / any} */
object mod {
  
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  @JSImport("delay", JSImport.Namespace)
  @js.native
  def apply(milliseconds: Double): ClearablePromise[Unit] = js.native
  @JSImport("delay", JSImport.Namespace)
  @js.native
  def apply(milliseconds: Double, options: Options): ClearablePromise[Unit] = js.native
  
  @JSImport("delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release.
  @JSImport("delay", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any = js.native
  
  @JSImport("delay", "createWithTimers")
  @js.native
  def createWithTimers(timers: ClearTimeout): Delay = js.native
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Create a promise which resolves after a random amount of milliseconds between `minimum` and `maximum` has passed.
  	Useful for tests and web scraping since they can have unpredictable performance. For example, if you have a test that asserts a method should not take longer than a certain amount of time, and then run it on a CI, it could take longer. So with `.range()`, you could give it a threshold instead.
  	@param minimum - Minimum amount of milliseconds to delay the promise.
  	@param maximum - Maximum amount of milliseconds to delay the promise.
  	@returns A promise which resolves after a random amount of milliseconds between `maximum` and `maximum` has passed.
  	*/
  @JSImport("delay", "range")
  @js.native
  def range[T](minimum: Double, maximum: Double): ClearablePromise[T] = js.native
  @JSImport("delay", "range")
  @js.native
  def range[T](minimum: Double, maximum: Double, options: Options with Value[T]): ClearablePromise[T] = js.native
  
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 is resolved.
  /**
  	Create a promise which rejects after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which rejects after the specified `milliseconds`.
  	*/
  @JSImport("delay", "reject")
  @js.native
  def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = js.native
  @JSImport("delay", "reject")
  @js.native
  def reject(milliseconds: Double, options: Optionsvalueunknownundefi): ClearablePromise[scala.Nothing] = js.native
  
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
    
    /**
    	Create a promise which resolves after a random amount of milliseconds between `minimum` and `maximum` has passed.
    	Useful for tests and web scraping since they can have unpredictable performance. For example, if you have a test that asserts a method should not take longer than a certain amount of time, and then run it on a CI, it could take longer. So with `.range()`, you could give it a threshold instead.
    	@param minimum - Minimum amount of milliseconds to delay the promise.
    	@param maximum - Maximum amount of milliseconds to delay the promise.
    	@returns A promise which resolves after a random amount of milliseconds between `maximum` and `maximum` has passed.
    	*/
    def range[T](minimum: Double, maximum: Double): ClearablePromise[T] = js.native
    def range[T](minimum: Double, maximum: Double, options: Options with Value[T]): ClearablePromise[T] = js.native
    
    // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 is resolved.
    /**
    	Create a promise which rejects after the specified `milliseconds`.
    	@param milliseconds - Milliseconds to delay the promise.
    	@returns A promise which rejects after the specified `milliseconds`.
    	*/
    def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = js.native
    def reject(milliseconds: Double, options: Optionsvalueunknownundefi): ClearablePromise[scala.Nothing] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
    		An optional AbortSignal to abort the delay.
    		If aborted, the Promise will be rejected with an AbortError.
    		*/
    var signal: js.UndefOr[AbortSignal] = js.native
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
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
