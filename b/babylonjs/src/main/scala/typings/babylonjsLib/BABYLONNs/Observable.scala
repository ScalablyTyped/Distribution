package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Observable class is a simple implementation of the Observable pattern.
     *
     * There's one slight particularity though: a given Observable can notify its observer using a particular mask value, only the Observers registered with this mask value will be notified.
     * This enable a more fine grained execution without having to rely on multiple different Observable objects.
     * For instance you may have a given Observable that have four different types of notifications: Move (mask = 0x01), Stop (mask = 0x02), Turn Right (mask = 0X04), Turn Left (mask = 0X08).
     * A given observer can register itself with only Move and Stop (mask = 0x03), then it will only be notified when one of these two occurs and will never be for Turn Left/Right.
     */
@JSGlobal("BABYLON.Observable")
@js.native
class Observable[T] () extends js.Object {
  /**
           * Creates a new observable
           * @param onObserverAdded defines a callback to call when a new observer is added
           */
  def this(onObserverAdded: js.Function1[/* observer */ Observer[T], scala.Unit]) = this()
  var _deferUnregister: js.Any = js.native
  var _eventState: js.Any = js.native
  var _observers: js.Any = js.native
  var _onObserverAdded: js.Any = js.native
  var _remove: js.Any = js.native
  /**
           * Create a new Observer with the specified callback
           * @param callback the callback that will be executed for that Observer
           * @param mask the mask used to filter observers
           * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
           * @param scope optional scope for the callback to be called from
           * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
           * @returns the new observer created for the callback
           */
  def add(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit]): Nullable[Observer[T]] = js.native
  /**
           * Create a new Observer with the specified callback
           * @param callback the callback that will be executed for that Observer
           * @param mask the mask used to filter observers
           * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
           * @param scope optional scope for the callback to be called from
           * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
           * @returns the new observer created for the callback
           */
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit],
    mask: scala.Double
  ): Nullable[Observer[T]] = js.native
  /**
           * Create a new Observer with the specified callback
           * @param callback the callback that will be executed for that Observer
           * @param mask the mask used to filter observers
           * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
           * @param scope optional scope for the callback to be called from
           * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
           * @returns the new observer created for the callback
           */
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit],
    mask: scala.Double,
    insertFirst: scala.Boolean
  ): Nullable[Observer[T]] = js.native
  /**
           * Create a new Observer with the specified callback
           * @param callback the callback that will be executed for that Observer
           * @param mask the mask used to filter observers
           * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
           * @param scope optional scope for the callback to be called from
           * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
           * @returns the new observer created for the callback
           */
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit],
    mask: scala.Double,
    insertFirst: scala.Boolean,
    scope: js.Any
  ): Nullable[Observer[T]] = js.native
  /**
           * Create a new Observer with the specified callback
           * @param callback the callback that will be executed for that Observer
           * @param mask the mask used to filter observers
           * @param insertFirst if true the callback will be inserted at the first position, hence executed before the others ones. If false (default behavior) the callback will be inserted at the last position, executed after all the others already present.
           * @param scope optional scope for the callback to be called from
           * @param unregisterOnFirstCall defines if the observer as to be unregistered after the next notification
           * @returns the new observer created for the callback
           */
  def add(
    callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit],
    mask: scala.Double,
    insertFirst: scala.Boolean,
    scope: js.Any,
    unregisterOnFirstCall: scala.Boolean
  ): Nullable[Observer[T]] = js.native
  /**
           * Create a new Observer with the specified callback and unregisters after the next notification
           * @param callback the callback that will be executed for that Observer
           * @returns the new observer created for the callback
           */
  def addOnce(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit]): Nullable[Observer[T]] = js.native
  /**
          * Clear the list of observers
          */
  def clear(): scala.Unit = js.native
  /**
           * Gets a boolean indicating if the observable has at least one observer
           * @returns true is the Observable has at least one Observer registered
           */
  def hasObservers(): scala.Boolean = js.native
  /**
           * Does this observable handles observer registered with a given mask
           * @param mask defines the mask to be tested
           * @return whether or not one observer registered with the given mask is handeled
          **/
  def hasSpecificMask(): scala.Boolean = js.native
  /**
           * Does this observable handles observer registered with a given mask
           * @param mask defines the mask to be tested
           * @return whether or not one observer registered with the given mask is handeled
          **/
  def hasSpecificMask(mask: scala.Double): scala.Boolean = js.native
  /**
           * Notify a specific observer
           * @param observer defines the observer to notify
           * @param eventData defines the data to be sent to each callback
           * @param mask is used to filter observers defaults to -1
           */
  def notifyObserver(observer: Observer[T], eventData: T): scala.Unit = js.native
  /**
           * Notify a specific observer
           * @param observer defines the observer to notify
           * @param eventData defines the data to be sent to each callback
           * @param mask is used to filter observers defaults to -1
           */
  def notifyObserver(observer: Observer[T], eventData: T, mask: scala.Double): scala.Unit = js.native
  /**
           * Notify all Observers by calling their respective callback with the given data
           * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
           * @param eventData defines the data to send to all observers
           * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
           * @param target defines the original target of the state
           * @param currentTarget defines the current target of the state
           * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
           */
  def notifyObservers(eventData: T): scala.Boolean = js.native
  /**
           * Notify all Observers by calling their respective callback with the given data
           * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
           * @param eventData defines the data to send to all observers
           * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
           * @param target defines the original target of the state
           * @param currentTarget defines the current target of the state
           * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
           */
  def notifyObservers(eventData: T, mask: scala.Double): scala.Boolean = js.native
  /**
           * Notify all Observers by calling their respective callback with the given data
           * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
           * @param eventData defines the data to send to all observers
           * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
           * @param target defines the original target of the state
           * @param currentTarget defines the current target of the state
           * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
           */
  def notifyObservers(eventData: T, mask: scala.Double, target: js.Any): scala.Boolean = js.native
  /**
           * Notify all Observers by calling their respective callback with the given data
           * Will return true if all observers were executed, false if an observer set skipNextObservers to true, then prevent the subsequent ones to execute
           * @param eventData defines the data to send to all observers
           * @param mask defines the mask of the current notification (observers with incompatible mask (ie mask & observer.mask === 0) will not be notified)
           * @param target defines the original target of the state
           * @param currentTarget defines the current target of the state
           * @returns false if the complete observer chain was not processed (because one observer set the skipNextObservers to true)
           */
  def notifyObservers(eventData: T, mask: scala.Double, target: js.Any, currentTarget: js.Any): scala.Boolean = js.native
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
           * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
           */
  def notifyObserversWithPromise(eventData: T): stdLib.Promise[T] = js.native
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
           * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
           */
  def notifyObserversWithPromise(eventData: T, mask: scala.Double): stdLib.Promise[T] = js.native
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
           * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
           */
  def notifyObserversWithPromise(eventData: T, mask: scala.Double, target: js.Any): stdLib.Promise[T] = js.native
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
           * @returns {Promise<T>} will return a Promise than resolves when all callbacks executed successfully.
           */
  def notifyObserversWithPromise(eventData: T, mask: scala.Double, target: js.Any, currentTarget: js.Any): stdLib.Promise[T] = js.native
  /**
           * Remove an Observer from the Observable object
           * @param observer the instance of the Observer to remove
           * @returns false if it doesn't belong to this Observable
           */
  def remove(observer: Nullable[Observer[T]]): scala.Boolean = js.native
  /**
           * Remove a callback from the Observable object
           * @param callback the callback to remove
           * @param scope optional scope. If used only the callbacks with this scope will be removed
           * @returns false if it doesn't belong to this Observable
          */
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit]): scala.Boolean = js.native
  /**
           * Remove a callback from the Observable object
           * @param callback the callback to remove
           * @param scope optional scope. If used only the callbacks with this scope will be removed
           * @returns false if it doesn't belong to this Observable
          */
  def removeCallback(callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit], scope: js.Any): scala.Boolean = js.native
}

