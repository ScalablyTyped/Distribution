package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ExecuteCodeAction")
@js.native
open class ExecuteCodeAction protected ()
  extends typings.babylonjs.actionsIndexMod.ExecuteCodeAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param func defines the callback function to run
    * @param condition defines the trigger related conditions
    */
  def this(
    triggerOptions: Any,
    func: js.Function1[/* evt */ typings.babylonjs.actionEventMod.ActionEvent, Unit]
  ) = this()
  def this(
    triggerOptions: Any,
    func: js.Function1[/* evt */ typings.babylonjs.actionEventMod.ActionEvent, Unit],
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}
