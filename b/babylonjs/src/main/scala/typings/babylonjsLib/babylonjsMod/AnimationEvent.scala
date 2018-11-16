package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Composed of a frame, and an action function
     */
@JSImport("babylonjs", "AnimationEvent")
@js.native
class AnimationEvent protected ()
  extends babylonjsLib.BABYLONNs.AnimationEvent {
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
}

