package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * @internal
    */
  def _deferUnregister(observer: Observer[T]): Unit = js.native
  
  /**
    * @internal
    */
  var _eventState: EventState = js.native
  
  /* private */ var _observers: Any = js.native
  
  /* private */ var _onObserverAdded: Any = js.native
  
  /* private */ var _remove: Any = js.native
  
  /**
    * Create a new Observer with the specified callback
    * @param callback the callback that will be executed for that Observer
    * @param mask the mask used to filter observers
    * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
    * @param scope optional scope for the callback to be called from
    * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
    * @returns the new observer created for the callback
    */
  def add(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Nullable[Observer[T]] = js.native
  def add(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit], mask: Double): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Boolean,
    scope: Unit,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Unit,
    scope: Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Unit,
    scope: Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Double,
    insertFirst: Unit,
    scope: Unit,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Boolean,
    scope: Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Boolean,
    scope: Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Boolean,
    scope: Unit,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Unit,
    scope: Any
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Unit,
    scope: Any,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
    mask: Unit,
    insertFirst: Unit,
    scope: Unit,
    unregisterOnFirstCall: Boolean
  ): Nullable[Observer[T]] = js.native
  
  /**
    * Create a new Observer with the specified callback and unregisters after the next notification
    * @param callback the callback that will be executed for that Observer
    * @returns the new observer created for the callback
    */
  def addOnce(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Nullable[Observer[T]] = js.native
  
  /**
    * Cancels all coroutines currently running on this observable
    */
  def cancelAllCoroutines(): Unit = js.native
  
  /**
    * Clear the list of observers
    */
  def clear(): Unit = js.native
  
  /**
    * Gets a boolean indicating if the observable has at least one observer
    * @returns true is the Observable has at least one Observer registered
    */
  def hasObservers(): Boolean = js.native
  
  /**
    * Does this observable handles observer registered with a given mask
    * @param mask defines the mask to be tested
    * @returns whether or not one observer registered with the given mask is handled
    **/
  def hasSpecificMask(): Boolean = js.native
  def hasSpecificMask(mask: Double): Boolean = js.native
  
  /**
    * Moves the observable to the bottom of the observer list making it get called last when notified
    * @param observer the observer to move
    */
  def makeObserverBottomPriority(observer: Observer[T]): Unit = js.native
  
  /**
    * Moves the observable to the top of the observer list making it get called first when notified
    * @param observer the observer to move
    */
  def makeObserverTopPriority(observer: Observer[T]): Unit = js.native
  
  /**
    * Notify a specific observer
    * @param observer defines the observer to notify
    * @param eventData defines the data to be sent to each callback
    * @param mask is used to filter observers defaults to -1
    */
  def notifyObserver(observer: Observer[T], eventData: T): Unit = js.native
  def notifyObserver(observer: Observer[T], eventData: T, mask: Double): Unit = js.native
  
  /**
    * Notify all Observers by calling their respective callback with the given data
    * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
    * @param eventData defines the data to send to all observers
    * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    * @param userInfo defines any user info to send to observers
    * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
    */
  def notifyObservers(eventData: T): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Any, currentTarget: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Any, currentTarget: Any, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Any, currentTarget: Unit, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: Any, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: Unit, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Any, currentTarget: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Any, currentTarget: Any, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Any, currentTarget: Unit, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: Any, userInfo: Any): Boolean = js.native
  def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: Unit, userInfo: Any): Boolean = js.native
  
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
    * Gets the list of observers
    */
  def observers: js.Array[Observer[T]] = js.native
  
  /**
    * Remove an Observer from the Observable object
    * @param observer the instance of the Observer to remove
    * @returns false if it doesn't belong to this Observable
    */
  def remove(observer: Nullable[Observer[T]]): Boolean = js.native
  
  /**
    * Remove a callback from the Observable object
    * @param callback the callback to remove
    * @param scope optional scope. If used only the callbacks with this scope will be removed
    * @returns false if it doesn't belong to this Observable
    */
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit]): Boolean = js.native
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit], scope: Any): Boolean = js.native
  
  /**
    * Runs a coroutine asynchronously on this observable
    * @param coroutine the iterator resulting from having started the coroutine
    * @returns a promise which will be resolved when the coroutine finishes or rejected if the coroutine is cancelled
    */
  def runCoroutineAsync(coroutine: AsyncCoroutine[Unit]): js.Promise[Unit] = js.native
}
