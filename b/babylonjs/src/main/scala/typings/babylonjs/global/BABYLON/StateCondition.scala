package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StateCondition")
@js.native
class StateCondition protected ()
  extends typings.babylonjs.BABYLON.StateCondition {
  /**
    * Creates a new StateCondition
    * @param actionManager manager for the action the condition applies to
    * @param target of the condition
    * @param value to compare with target state
    */
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: js.Any,
    /** Value to compare with target state  */
  value: String
  ) = this()
}
