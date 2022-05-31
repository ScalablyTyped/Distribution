package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("babylonjs/Misc/observable", "EventState")
  @js.native
  class EventState protected () extends StObject {
    /**
      * Create a new EventState
      * @param mask defines the mask associated with this state
      * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
      * @param target defines the original target of the state
      * @param currentTarget defines the current target of the state
      */
    def this(mask: Double) = this()
    def this(mask: Double, skipNextObservers: Boolean) = this()
    def this(mask: Double, skipNextObservers: Boolean, target: js.Any) = this()
    def this(mask: Double, skipNextObservers: Unit, target: js.Any) = this()
    def this(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any) = this()
    def this(mask: Double, skipNextObservers: Boolean, target: Unit, currentTarget: js.Any) = this()
    def this(mask: Double, skipNextObservers: Unit, target: js.Any, currentTarget: js.Any) = this()
    def this(mask: Double, skipNextObservers: Unit, target: Unit, currentTarget: js.Any) = this()
    
    /**
      * The current object in the bubbling phase
      */
    var currentTarget: js.UndefOr[js.Any] = js.native
    
    /**
      * Initialize the current event state
      * @param mask defines the mask associated with this state
      * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
      * @param target defines the original target of the state
      * @param currentTarget defines the current target of the state
      * @returns the current event state
      */
    def initalize(mask: Double): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Boolean): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Boolean, target: Unit, currentTarget: js.Any): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Unit, target: js.Any): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Unit, target: js.Any, currentTarget: js.Any): EventState = js.native
    def initalize(mask: Double, skipNextObservers: Unit, target: Unit, currentTarget: js.Any): EventState = js.native
    
    /**
      * This will be populated with the return value of the last function that was executed.
      * If it is the first function in the callback chain it will be the event data.
      */
    var lastReturnValue: js.UndefOr[js.Any] = js.native
    
    /**
      * Get the mask value that were used to trigger the event corresponding to this EventState object
      */
    var mask: Double = js.native
    
    /**
      * An Observer can set this property to true to prevent subsequent observers of being notified
      */
    var skipNextObservers: Boolean = js.native
    
    /**
      * The object that originally notified the event
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /**
      * User defined information that will be sent to observers
      */
    var userInfo: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("babylonjs/Misc/observable", "MultiObserver")
  @js.native
  class MultiObserver[T] () extends StObject {
    
    /* private */ var _observables: js.Any = js.native
    
    /* private */ var _observers: js.Any = js.native
    
    /**
      * Release associated resources
      */
    def dispose(): Unit = js.native
  }
  /* static members */
  object MultiObserver {
    
    @JSImport("babylonjs/Misc/observable", "MultiObserver")
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
      scope: js.Any
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
    inline def Watch[T](
      observables: js.Array[Observable[T]],
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Unit,
      scope: js.Any
    ): MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[MultiObserver[T]]
  }
  
  @JSImport("babylonjs/Misc/observable", "Observable")
  @js.native
  /**
    * Creates a new observable
    * @param onObserverAdded defines a callback to call when a new observer is added
    */
  class Observable[T] () extends StObject {
    def this(onObserverAdded: js.Function1[/* observer */ Observer[T], Unit]) = this()
    
    /* private */ var _deferUnregister: js.Any = js.native
    
    /* private */ var _eventState: js.Any = js.native
    
    /* private */ var _observers: js.Any = js.native
    
    /* private */ var _onObserverAdded: js.Any = js.native
    
    /* private */ var _remove: js.Any = js.native
    
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
      scope: js.Any
    ): Nullable[Observer[T]] = js.native
    def add(
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Double,
      insertFirst: Boolean,
      scope: js.Any,
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
      scope: js.Any
    ): Nullable[Observer[T]] = js.native
    def add(
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Double,
      insertFirst: Unit,
      scope: js.Any,
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
      scope: js.Any
    ): Nullable[Observer[T]] = js.native
    def add(
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Unit,
      insertFirst: Boolean,
      scope: js.Any,
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
      scope: js.Any
    ): Nullable[Observer[T]] = js.native
    def add(
      callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      mask: Unit,
      insertFirst: Unit,
      scope: js.Any,
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
      * @return whether or not one observer registered with the given mask is handeled
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
    def notifyObservers(eventData: T, mask: Double, target: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: js.Any, currentTarget: Unit, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: js.Any, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Double, target: Unit, currentTarget: Unit, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: js.Any, currentTarget: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: js.Any, currentTarget: js.Any, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: js.Any, currentTarget: Unit, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: js.Any, userInfo: js.Any): Boolean = js.native
    def notifyObservers(eventData: T, mask: Unit, target: Unit, currentTarget: Unit, userInfo: js.Any): Boolean = js.native
    
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
    def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any, currentTarget: js.Any, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: js.Any, currentTarget: Unit, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: js.Any, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Double, target: Unit, currentTarget: Unit, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: js.Any, currentTarget: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: js.Any, currentTarget: js.Any, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: js.Any, currentTarget: Unit, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: js.Any, userInfo: js.Any): js.Promise[T] = js.native
    def notifyObserversWithPromise(eventData: T, mask: Unit, target: Unit, currentTarget: Unit, userInfo: js.Any): js.Promise[T] = js.native
    
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
    def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit], scope: js.Any): Boolean = js.native
  }
  
  @JSImport("babylonjs/Misc/observable", "Observer")
  @js.native
  class Observer[T] protected () extends StObject {
    /**
      * Creates a new observer
      * @param callback defines the callback to call when the observer is notified
      * @param mask defines the mask of the observer (used to filter notifications)
      * @param scope defines the current scope used to restore the JS context
      */
    def this(
      /**
      * Defines the callback to call when the observer is notified
      */
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      /**
      * Defines the mask of the observer (used to filter notifications)
      */
    mask: Double
    ) = this()
    def this(
      /**
      * Defines the callback to call when the observer is notified
      */
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, Unit],
      /**
      * Defines the mask of the observer (used to filter notifications)
      */
    mask: Double,
      /**
      * Defines the current scope used to restore the JS context
      */
    scope: js.Any
    ) = this()
    
    /** @hidden */
    var _willBeUnregistered: Boolean = js.native
    
    /**
      * Defines the callback to call when the observer is notified
      */
    def callback(eventData: T, eventState: EventState): Unit = js.native
    
    /**
      * Defines the mask of the observer (used to filter notifications)
      */
    var mask: Double = js.native
    
    /**
      * Defines the current scope used to restore the JS context
      */
    var scope: js.Any = js.native
    
    /**
      * Gets or sets a property defining that the observer as to be unregistered after the next notification
      */
    var unregisterOnNextCall: Boolean = js.native
  }
}
