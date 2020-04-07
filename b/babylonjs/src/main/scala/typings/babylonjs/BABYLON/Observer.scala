package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Observer")
@js.native
class Observer[T] protected () extends js.Object {
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
  /**
    * Defines the callback to call when the observer is notified
    */
  def callback(eventData: T, eventState: EventState): Unit = js.native
}

