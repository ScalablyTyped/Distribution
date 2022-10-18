package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MultiObserver")
@js.native
open class MultiObserver[T] ()
  extends typings.babylonjs.legacyLegacyMod.MultiObserver[T]
/* static members */
object MultiObserver {
  
  @JSImport("babylonjs", "MultiObserver")
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
    observables: js.Array[typings.babylonjs.miscObservableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
      Unit
    ]
  ): typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.miscObservableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
      Unit
    ],
    mask: Double
  ): typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.miscObservableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
      Unit
    ],
    mask: Double,
    scope: Any
  ): typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T]]
  inline def Watch[T](
    observables: js.Array[typings.babylonjs.miscObservableMod.Observable[T]],
    callback: js.Function2[
      /* eventData */ T, 
      /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
      Unit
    ],
    mask: Unit,
    scope: Any
  ): typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(observables.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.miscObservableDotextensionsMod.MultiObserver[T]]
}
