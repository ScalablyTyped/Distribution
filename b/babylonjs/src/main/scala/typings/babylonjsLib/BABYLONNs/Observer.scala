package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represent an Observer registered to a given Observable object.
     */
@JSGlobal("BABYLON.Observer")
@js.native
class Observer[T] protected () extends js.Object {
  /**
           * Creates a new observer
           * @param callback defines the callback to call when the observer is notified
           * @param mask defines the mask of the observer (used to filter notifications)
           * @param scope defines the current scope used to restore the JS context
           */
  def this(/**
           * Defines the callback to call when the observer is notified
           */
  callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit], /**
           * Defines the mask of the observer (used to filter notifications)
           */
  mask: scala.Double) = this()
  /**
           * Creates a new observer
           * @param callback defines the callback to call when the observer is notified
           * @param mask defines the mask of the observer (used to filter notifications)
           * @param scope defines the current scope used to restore the JS context
           */
  def this(/**
           * Defines the callback to call when the observer is notified
           */
  callback: js.Function2[/* eventData */ T, /* eventState */ EventState, scala.Unit], /**
           * Defines the mask of the observer (used to filter notifications)
           */
  mask: scala.Double, /**
           * Defines the current scope used to restore the JS context
           */
  scope: js.Any) = this()
  /** @hidden */
  var _willBeUnregistered: scala.Boolean = js.native
  /**
           * Defines the mask of the observer (used to filter notifications)
           */
  var mask: scala.Double = js.native
  /**
           * Defines the current scope used to restore the JS context
           */
  var scope: js.Any = js.native
  /**
           * Gets or sets a property defining that the observer as to be unregistered after the next notification
           */
  var unregisterOnNextCall: scala.Boolean = js.native
  /**
           * Defines the callback to call when the observer is notified
           */
  def callback(eventData: T, eventState: EventState): scala.Unit = js.native
}

