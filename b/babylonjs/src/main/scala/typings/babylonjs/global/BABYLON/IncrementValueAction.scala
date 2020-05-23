package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.IncrementValueAction")
@js.native
class IncrementValueAction protected ()
  extends typings.babylonjs.BABYLON.IncrementValueAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the property
    * @param propertyPath defines the path of the property to increment in the target
    * @param value defines the value value we should increment the property by
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

