package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to increment the target value
     *  to a desired value once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSImport("babylonjs", "IncrementValueAction")
@js.native
class IncrementValueAction protected ()
  extends babylonjsLib.BABYLONNs.IncrementValueAction {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the object containing the property
           * @param propertyPath defines the path of the property to increment in the target
           * @param value defines the value value we should increment the property by
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the object containing the property
           * @param propertyPath defines the path of the property to increment in the target
           * @param value defines the value value we should increment the property by
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, value: js.Any, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

