package typings.babylonjs

import typings.babylonjs.miscObservableMod.EventState
import typings.babylonjs.miscObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscObservableDotextensionsMod {
  
  @JSImport("babylonjs/Misc/observable.extensions", "MultiObserver")
  @js.native
  open class MultiObserver[T] () extends StObject {
    
    /* private */ var _observables: Any = js.native
    
    /* private */ var _observers: Any = js.native
    
    /**
      * Release associated resources
      */
    def dispose(): Unit = js.native
  }
  /* static members */
  object MultiObserver {
    
    @JSImport("babylonjs/Misc/observable.extensions", "MultiObserver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Raise a callback when one of the observable will notify
      * @param observables defines a list of observables to watch
      * @param callback defines the callback to call on notification
      * @param mask defines the mask used to filter notifications
      * @param scope defines the current scope used to restore the JS context
      * @returns the new MultiObserver
      */
    inline def Watch[T](
      observables: js.Array[Observable[T]],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
    inline def Watch[T](
      observables: js.Array[Observable[T]],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Double
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
    inline def Watch[T](
      observables: js.Array[Observable[T]],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Double,
      scope: Any
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
    inline def Watch[T](
      observables: js.Array[Observable[T]],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Unit,
      scope: Any
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
  }
  
  /* augmented module */
  object babylonjsMiscObservableAugmentingMod {
    
    @js.native
    trait Observable[T] extends StObject {
      
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
    }
  }
}
