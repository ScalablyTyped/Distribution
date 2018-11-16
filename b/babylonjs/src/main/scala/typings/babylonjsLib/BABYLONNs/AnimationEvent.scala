package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Composed of a frame, and an action function
     */
@JSGlobal("BABYLON.AnimationEvent")
@js.native
class AnimationEvent protected () extends js.Object {
  /**
           * Initializes the animation event
           * @param frame The frame for which the event is triggered
           * @param action The event to perform when triggered
           * @param onlyOnce Specifies if the event should be triggered only once
           */
  def this(/** The frame for which the event is triggered **/
  frame: scala.Double, /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ scala.Double, scala.Unit]) = this()
  /**
           * Initializes the animation event
           * @param frame The frame for which the event is triggered
           * @param action The event to perform when triggered
           * @param onlyOnce Specifies if the event should be triggered only once
           */
  def this(/** The frame for which the event is triggered **/
  frame: scala.Double, /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ scala.Double, scala.Unit], /** Specifies if the event should be triggered only once**/
  onlyOnce: scala.Boolean) = this()
  /** The frame for which the event is triggered **/
  var frame: scala.Double = js.native
  /**
           * Specifies if the animation event is done
           */
  var isDone: scala.Boolean = js.native
  /** Specifies if the event should be triggered only once**/
  var onlyOnce: js.UndefOr[scala.Boolean] = js.native
  /** @hidden */
  def _clone(): AnimationEvent = js.native
  /** The event to perform when triggered **/
  def action(currentFrame: scala.Double): scala.Unit = js.native
}

