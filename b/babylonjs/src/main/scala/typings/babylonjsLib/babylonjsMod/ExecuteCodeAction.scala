package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action responsible to run code (external event) once triggered.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSImport("babylonjs", "ExecuteCodeAction")
@js.native
class ExecuteCodeAction protected ()
  extends babylonjsLib.BABYLONNs.ExecuteCodeAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ babylonjsLib.BABYLONNs.ActionEvent, scala.Unit]) = this()
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ babylonjsLib.BABYLONNs.ActionEvent, scala.Unit], condition: babylonjsLib.BABYLONNs.Condition) = this()
}

