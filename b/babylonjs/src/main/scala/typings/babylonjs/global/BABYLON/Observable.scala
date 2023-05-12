package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  * @param notifyIfTriggered If set to true the observable will notify when an observer was added if the observable was already triggered.
  */
open class Observable[T] ()
  extends StObject
     with typings.babylonjs.BABYLON.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typings.babylonjs.BABYLON.Observer[T], Unit]) = this()
  def this(
    onObserverAdded: js.Function1[/* observer */ typings.babylonjs.BABYLON.Observer[T], Unit],
    /**
    * If set to true the observable will notify when an observer was added if the observable was already triggered.
    * This is helpful to single-state observables like the scene onReady or the dispose observable.
    */
  notifyIfTriggered: Boolean
  ) = this()
  def this(
    onObserverAdded: Unit,
    /**
    * If set to true the observable will notify when an observer was added if the observable was already triggered.
    * This is helpful to single-state observables like the scene onReady or the dispose observable.
    */
  notifyIfTriggered: Boolean
  ) = this()
}
/* static members */
object Observable {
  
  @JSGlobal("BABYLON.Observable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an observable from a Promise.
    * @param promise a promise to observe for fulfillment.
    * @param onErrorObservable an observable to notify if a promise was rejected.
    * @returns the new Observable
    */
  inline def FromPromise[T, E](promise: js.Promise[T]): typings.babylonjs.BABYLON.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.Observable[T]]
  inline def FromPromise[T, E](promise: js.Promise[T], onErrorObservable: typings.babylonjs.BABYLON.Observable[E]): typings.babylonjs.BABYLON.Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("FromPromise")(promise.asInstanceOf[js.Any], onErrorObservable.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Observable[T]]
}
