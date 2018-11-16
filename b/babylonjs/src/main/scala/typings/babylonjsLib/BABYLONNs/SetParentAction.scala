package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to set the parent property of the target once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSGlobal("BABYLON.SetParentAction")
@js.native
class SetParentAction protected () extends Action {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the target containing the parent property
           * @param parent defines from where the animation should start (animation frame)
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, parent: js.Any) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the target containing the parent property
           * @param parent defines from where the animation should start (animation frame)
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, parent: js.Any, condition: Condition) = this()
  var _parent: js.Any = js.native
  var _target: js.Any = js.native
}

