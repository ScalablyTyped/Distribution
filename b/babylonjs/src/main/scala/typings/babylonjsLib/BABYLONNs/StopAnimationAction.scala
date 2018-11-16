package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to stop an animation once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSGlobal("BABYLON.StopAnimationAction")
@js.native
class StopAnimationAction protected () extends Action {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the target animation or animation name
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the target animation or animation name
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, condition: Condition) = this()
  var _target: js.Any = js.native
}

