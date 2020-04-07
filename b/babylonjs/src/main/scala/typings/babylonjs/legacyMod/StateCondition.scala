package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "StateCondition")
@js.native
class StateCondition protected ()
  extends typings.babylonjs.indexMod.StateCondition {
  /**
    * Creates a new StateCondition
    * @param actionManager manager for the action the condition applies to
    * @param target of the condition
    * @param value to compare with target state
    */
  def this(
    actionManager: typings.babylonjs.actionManagerMod.ActionManager,
    target: js.Any,
    /** Value to compare with target state  */
  value: String
  ) = this()
}

