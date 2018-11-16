package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to run code (external event) once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSGlobal("BABYLON.ExecuteCodeAction")
@js.native
class ExecuteCodeAction protected () extends Action {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param func defines the callback function to run
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, scala.Unit]) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param func defines the callback function to run
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, scala.Unit], condition: Condition) = this()
  /**
           * The callback function to run.
           */
  def func(evt: ActionEvent): scala.Unit = js.native
}

