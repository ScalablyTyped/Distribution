package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "SwitchBooleanAction")
@js.native
class SwitchBooleanAction protected ()
  extends typings.babylonjs.indexMod.SwitchBooleanAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the boolean
    * @param propertyPath defines the path to the boolean property in the target object
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    propertyPath: String,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}

