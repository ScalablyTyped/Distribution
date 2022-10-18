package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CombineAction")
@js.native
open class CombineAction protected ()
  extends typings.babylonjs.legacyLegacyMod.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    * @param enableChildrenConditions defines if the children actions conditions should be check before execution
    */
  def this(triggerOptions: Any, children: js.Array[typings.babylonjs.actionsActionMod.Action]) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionsActionMod.Action],
    condition: typings.babylonjs.actionsConditionMod.Condition
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionsActionMod.Action],
    condition: Unit,
    enableChildrenConditions: Boolean
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionsActionMod.Action],
    condition: typings.babylonjs.actionsConditionMod.Condition,
    enableChildrenConditions: Boolean
  ) = this()
}
