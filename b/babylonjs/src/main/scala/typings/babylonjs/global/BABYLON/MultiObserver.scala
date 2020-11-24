package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MultiObserver")
@js.native
class MultiObserver[T] ()
  extends typings.babylonjs.BABYLON.MultiObserver[T]
/* static members */
@JSGlobal("BABYLON.MultiObserver")
@js.native
object MultiObserver extends js.Object {
  
  /**
    * Raise a callback when one of the observable will notify
    * @param observables defines a list of observables to watch
    * @param callback defines the callback to call on notification
    * @param mask defines the mask used to filter notifications
    * @param scope defines the current scope used to restore the JS context
    * @returns the new MultiObserver
    */
  def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit]
  ): typings.babylonjs.BABYLON.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: js.UndefOr[scala.Nothing],
    scope: js.Any
  ): typings.babylonjs.BABYLON.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: Double
  ): typings.babylonjs.BABYLON.MultiObserver[T] = js.native
  def Watch[T](
    observables: js.Array[typings.babylonjs.BABYLON.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    mask: Double,
    scope: js.Any
  ): typings.babylonjs.BABYLON.MultiObserver[T] = js.native
}
