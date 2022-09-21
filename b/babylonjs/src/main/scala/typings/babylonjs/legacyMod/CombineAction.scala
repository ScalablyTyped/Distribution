package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "CombineAction")
@js.native
open class CombineAction protected ()
  extends typings.babylonjs.indexMod.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    * @param enableChildrenConditions defines if the children actions conditions should be check before execution
    */
  def this(triggerOptions: Any, children: js.Array[typings.babylonjs.actionMod.Action]) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionMod.Action],
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionMod.Action],
    condition: Unit,
    enableChildrenConditions: Boolean
  ) = this()
  def this(
    triggerOptions: Any,
    children: js.Array[typings.babylonjs.actionMod.Action],
    condition: typings.babylonjs.conditionMod.Condition,
    enableChildrenConditions: Boolean
  ) = this()
}
