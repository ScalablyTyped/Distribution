package typings.babylonjs.legacyMod

import typings.babylonjs.coroutineMod.AsyncCoroutine
import typings.babylonjs.coroutineMod.CoroutineScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMiscObservableAugmentingMod {
  
  @js.native
  trait Observable[T] extends StObject {
    
    /**
      * Internal observable-based coroutine scheduler instance.
      */
    var _coroutineScheduler: js.UndefOr[CoroutineScheduler[Unit]] = js.native
    
    /**
      * Internal disposal method for observable-based coroutine scheduler instance.
      */
    var _coroutineSchedulerDispose: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Cancels all coroutines currently running on this observable
      */
    def cancelAllCoroutines(): Unit = js.native
    
    /**
      * Calling this will execute each callback, expecting it to be a promise or return a value.
      * If at any point in the chain one function fails, the promise will fail and the execution will not continue.
      * This is useful when a chain of events (sometimes async events) is needed to initialize a certain object
      * and it is crucial that all callbacks will be executed.
      * The order of the callbacks is kept, callbacks are not executed parallel.
      *
      * @param eventData The data to be sent to each callback
      * @param mask is used to filter observers defaults to -1
      * @param target defines the callback target (see EventState)
      * @param currentTarget defines he current object in the bubbling phase
      * @param userInfo defines any user info to send to observers
      * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
      */
    def notifyObserversWithPromise(eventData: T): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Any, currentTarget: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Any, currentTarget: Any, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Any, currentTarget: Unit, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: Any, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: Unit, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Any, currentTarget: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Any, currentTarget: Any, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Any, currentTarget: Unit, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: Any, userInfo: Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: Unit, userInfo: Any): js.Promise[T] = js.native
    
    /**
      * Runs a coroutine asynchronously on this observable
      * @param coroutine the iterator resulting from having started the coroutine
      * @returns a promise which will be resolved when the coroutine finishes or rejected if the coroutine is cancelled
      */
    def runCoroutineAsync(coroutine: AsyncCoroutine[Unit]): js.Promise[Unit] = js.native
  }
}
