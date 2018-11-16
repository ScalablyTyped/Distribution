package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represent an Observer registered to a given Observable object.
     */
@JSImport("babylonjs", "Observer")
@js.native
class Observer[T] protected ()
  extends babylonjsLib.BABYLONNs.Observer[T] {
  /**
           * Creates a new observer
           * @param callback defines the callback to call when the observer is notified
           * @param mask defines the mask of the observer (used to filter notifications)
           * @param scope defines the current scope used to restore the JS context
           */
  def this(/**
           * Defines the callback to call when the observer is notified
           */
  callback: js.Function2[/* eventData */ T, /* eventState */ babylonjsLib.BABYLONNs.EventState, scala.Unit], /**
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
  callback: js.Function2[/* eventData */ T, /* eventState */ babylonjsLib.BABYLONNs.EventState, scala.Unit], /**
           * Defines the mask of the observer (used to filter notifications)
           */
  mask: scala.Double, /**
           * Defines the current scope used to restore the JS context
           */
  scope: js.Any) = this()
}

