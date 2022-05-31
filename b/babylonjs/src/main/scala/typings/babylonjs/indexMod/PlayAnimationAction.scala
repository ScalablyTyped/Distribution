package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PlayAnimationAction")
@js.native
class PlayAnimationAction protected ()
  extends typings.babylonjs.actionsIndexMod.PlayAnimationAction {
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
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    from: Double,
    to: Double,
    loop: Unit,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}
