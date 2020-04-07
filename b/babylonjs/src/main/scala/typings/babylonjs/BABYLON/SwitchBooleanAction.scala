package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SwitchBooleanAction")
@js.native
class SwitchBooleanAction protected () extends Action {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the boolean
    * @param propertyPath defines the path to the boolean property in the target object
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String) = this()
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, condition: Condition) = this()
  var _effectiveTarget: js.Any = js.native
  var _property: js.Any = js.native
  var _target: js.Any = js.native
  /**
    * The path to the boolean property in the target object
    */
  var propertyPath: String = js.native
}

