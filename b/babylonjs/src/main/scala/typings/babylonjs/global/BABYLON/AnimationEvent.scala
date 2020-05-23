package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AnimationEvent")
@js.native
class AnimationEvent protected ()
  extends typings.babylonjs.BABYLON.AnimationEvent {
  /**
    * Initializes the animation event
    * @param frame The frame for which the event is triggered
    * @param action The event to perform when triggered
    * @param onlyOnce Specifies if the event should be triggered only once
    */
  def this(
    /** The frame for which the event is triggered **/
  frame: Double,
    /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ Double, Unit]
  ) = this()
  def this(
    /** The frame for which the event is triggered **/
  frame: Double,
    /** The event to perform when triggered **/
  action: js.Function1[/* currentFrame */ Double, Unit],
    /** Specifies if the event should be triggered only once**/
  onlyOnce: Boolean
  ) = this()
  /** The frame for which the event is triggered **/
  /* CompleteClass */
  override var frame: Double = js.native
  /**
    * Specifies if the animation event is done
    */
  /* CompleteClass */
  override var isDone: Boolean = js.native
  /** @hidden */
  /* CompleteClass */
  override def _clone(): typings.babylonjs.BABYLON.AnimationEvent = js.native
  /** The event to perform when triggered **/
  /* CompleteClass */
  override def action(currentFrame: Double): Unit = js.native
}

