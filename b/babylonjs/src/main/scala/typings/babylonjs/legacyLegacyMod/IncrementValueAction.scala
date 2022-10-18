package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "IncrementValueAction")
@js.native
open class IncrementValueAction protected ()
  extends typings.babylonjs.indexMod.IncrementValueAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the property
    * @param propertyPath defines the path of the property to increment in the target
    * @param value defines the value value we should increment the property by
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
  def this(
    triggerOptions: Any,
    target: Any,
    propertyPath: String,
    value: Any,
    condition: typings.babylonjs.actionsConditionMod.Condition
  ) = this()
}
