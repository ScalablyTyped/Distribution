package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ExecuteCodeAction")
@js.native
class ExecuteCodeAction protected ()
  extends typings.babylonjs.BABYLON.ExecuteCodeAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, func: js.Function1[/* evt */ typings.babylonjs.BABYLON.ActionEvent, Unit]) = this()
  def this(
    triggerOptions: js.Any,
    func: js.Function1[/* evt */ typings.babylonjs.BABYLON.ActionEvent, Unit],
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
