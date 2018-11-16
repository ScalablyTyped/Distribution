package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to set a property of the target
     *  to a desired value once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSImport("babylonjs", "SetValueAction")
@js.native
class SetValueAction protected ()
  extends babylonjsLib.BABYLONNs.SetValueAction {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the object containing the property
           * @param propertyPath defines the path of the property to set in the target
           * @param value defines the value to set in the property
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the object containing the property
           * @param propertyPath defines the path of the property to set in the target
           * @param value defines the value to set in the property
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

