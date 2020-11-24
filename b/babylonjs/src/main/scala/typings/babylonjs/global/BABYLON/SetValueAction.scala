package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SetValueAction")
@js.native
class SetValueAction protected ()
  extends typings.babylonjs.BABYLON.SetValueAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the property
    * @param propertyPath defines the path of the property to set in the target
    * @param value defines the value to set in the property
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
  def this(
    triggerOptions: js.Any,
    target: js.Any,
    propertyPath: String,
    value: js.Any,
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
