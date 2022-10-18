package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ExecuteCodeAction")
@js.native
open class ExecuteCodeAction protected ()
  extends typings.babylonjs.legacyLegacyMod.ExecuteCodeAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(
    triggerOptions: Any,
    func: js.Function1[/* evt */ typings.babylonjs.actionsActionEventMod.ActionEvent, Unit]
  ) = this()
  def this(
    triggerOptions: Any,
    func: js.Function1[/* evt */ typings.babylonjs.actionsActionEventMod.ActionEvent, Unit],
    condition: typings.babylonjs.actionsConditionMod.Condition
  ) = this()
}
