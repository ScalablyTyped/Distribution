package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Observer")
@js.native
open class Observer[T] protected ()
  extends typings.babylonjs.legacyLegacyMod.Observer[T] {
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
  callback: js.Function2[
        /* eventData */ T, 
        /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
        Unit
      ],
    /**
    * Defines the mask of the observer (used to filter notifications)
    */
  mask: Double
  ) = this()
  def this(
    /**
    * Defines the callback to call when the observer is notified
    */
  callback: js.Function2[
        /* eventData */ T, 
        /* eventState */ typings.babylonjs.miscObservableMod.EventState, 
        Unit
      ],
    /**
    * Defines the mask of the observer (used to filter notifications)
    */
  mask: Double,
    /**
    * Defines the current scope used to restore the JS context
    */
  scope: Any
  ) = this()
}
