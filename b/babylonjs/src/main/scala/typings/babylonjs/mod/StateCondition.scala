package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StateCondition")
@js.native
open class StateCondition protected ()
  extends typings.babylonjs.legacyLegacyMod.StateCondition {
  /**
    * Creates a new StateCondition
    * @param actionManager manager for the action the condition applies to
    * @param target of the condition
    * @param value to compare with target state
    */
  def this(
    actionManager: typings.babylonjs.actionsActionManagerMod.ActionManager,
    target: Any,
    /** Value to compare with target state  */
  value: String
  ) = this()
}
