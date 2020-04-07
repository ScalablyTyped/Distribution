package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PlayAnimationAction")
@js.native
class PlayAnimationAction protected () extends Action {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the target animation or animation name
    * @param from defines from where the animation should start (animation frame)
    * @param end defines where the animation should stop (animation frame)
    * @param loop defines if the animation should loop or stop after the first play
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double) = this()
  def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double, loop: Boolean) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    from: Double,
    to: Double,
    loop: Boolean,
    condition: Condition
  ) = this()
  var _target: js.Any = js.native
  /**
    * Where the animation should start (animation frame)
    */
  var from: Double = js.native
  /**
    * Define if the animation should loop or stop after the first play.
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Where the animation should stop (animation frame)
    */
  var to: Double = js.native
}

