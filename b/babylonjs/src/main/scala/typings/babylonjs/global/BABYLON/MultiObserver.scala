package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiObserver")
@js.native
open class MultiObserver[T] ()
  extends StObject
     with typings.babylonjs.BABYLON.MultiObserver[T] {
  
  /* private */ /* CompleteClass */
  var _observables: Any = js.native
  
  /* private */ /* CompleteClass */
  var _observers: Any = js.native
  
  /**
    * Release associated resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object MultiObserver {
  
  @JSGlobal("BABYLON.MultiObserver")
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
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit]
  ): typings.babylonjs.BABYLON.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: Double
  ): typings.babylonjs.BABYLON.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: Double,
    scope: Any
  ): typings.babylonjs.BABYLON.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: Unit,
    scope: Any
  ): typings.babylonjs.BABYLON.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.MultiObserver[T]]
}
