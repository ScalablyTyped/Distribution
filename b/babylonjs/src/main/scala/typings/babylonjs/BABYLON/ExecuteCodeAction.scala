package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ExecuteCodeAction")
@js.native
class ExecuteCodeAction protected () extends Action {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, Unit]) = this()
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, Unit], condition: Condition) = this()
  /**
    * The callback function to run.
    */
  def func(evt: ActionEvent): Unit = js.native
}

