package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "SetStateAction")
@js.native
class SetStateAction protected ()
  extends typings.babylonjs.indexMod.SetStateAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the state property
    * @param value defines the value to store in the state field
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, value: String) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    value: String,
    condition: typings.babylonjs.conditionMod.Condition
  ) = this()
}

