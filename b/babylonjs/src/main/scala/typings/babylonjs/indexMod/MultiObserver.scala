package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MultiObserver")
@js.native
class MultiObserver[T] ()
  extends typings.babylonjs.miscIndexMod.MultiObserver[T]
/* static members */
object MultiObserver {
  
  @JSImport("babylonjs/index", "MultiObserver")
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
    observables: js.Array[typings.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.observableMod.EventState, Unit]
  ): typings.babylonjs.observableMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.observableMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.observableMod.EventState, Unit],
    mask: Double
  ): typings.babylonjs.observableMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.observableMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.observableMod.EventState, Unit],
    mask: Double,
    scope: js.Any
  ): typings.babylonjs.observableMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.observableMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.observableMod.Observable[T]],
    callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.observableMod.EventState, Unit],
    mask: Unit,
    scope: js.Any
  ): typings.babylonjs.observableMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.observableMod.MultiObserver[T]]
}
