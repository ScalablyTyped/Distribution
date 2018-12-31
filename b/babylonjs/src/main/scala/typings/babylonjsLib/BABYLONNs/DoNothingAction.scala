package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action responsible that does nothing once triggered.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSGlobal("BABYLON.DoNothingAction")
@js.native
/**
  * Instantiate the action
  * @param triggerOptions defines the trigger options
  * @param condition defines the trigger related conditions
  */
class DoNothingAction () extends Action {
  def this(triggerOptions: js.Any) = this()
  def this(triggerOptions: js.Any, condition: Condition) = this()
}

