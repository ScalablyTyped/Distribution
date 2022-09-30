package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Observer")
@js.native
open class Observer[T] protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Observer[T] {
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
  callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    /**
    * Defines the mask of the observer (used to filter notifications)
    */
  mask: Double
  ) = this()
  def this(
    /**
    * Defines the callback to call when the observer is notified
    */
  callback: js.Function2[/* eventData */ T, /* eventState */ typings.babylonjs.BABYLON.EventState, Unit],
    /**
    * Defines the mask of the observer (used to filter notifications)
    */
  mask: Double,
    /**
    * Defines the current scope used to restore the JS context
    */
  scope: Any
  ) = this()
  
  /** @internal */
  /* CompleteClass */
  var _willBeUnregistered: Boolean = js.native
  
  /**
    * Defines the callback to call when the observer is notified
    */
  /* CompleteClass */
  override def callback(eventData: T, eventState: typings.babylonjs.BABYLON.EventState): Unit = js.native
  
  /**
    * Defines the mask of the observer (used to filter notifications)
    */
  /* CompleteClass */
  var mask: Double = js.native
  
  /**
    * Defines the current scope used to restore the JS context
    */
  /* CompleteClass */
  var scope: Any = js.native
  
  /**
    * Gets or sets a property defining that the observer as to be unregistered after the next notification
    */
  /* CompleteClass */
  var unregisterOnNextCall: Boolean = js.native
}
