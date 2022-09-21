package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SwitchBooleanAction")
@js.native
open class SwitchBooleanAction protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SwitchBooleanAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the boolean
    * @param propertyPath defines the path to the boolean property in the target object
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, propertyPath: String) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    propertyPath: String,
    condition: typings.babylonjs.BABYLON.Condition
  ) = this()
}
