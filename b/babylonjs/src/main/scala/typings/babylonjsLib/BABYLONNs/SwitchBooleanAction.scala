package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to toggle a boolean once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
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
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param target defines the object containing the boolean
           * @param propertyPath defines the path to the boolean property in the target object
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: java.lang.String, condition: Condition) = this()
  var _effectiveTarget: js.Any = js.native
  var _property: js.Any = js.native
  var _target: js.Any = js.native
  /**
           * The path to the boolean property in the target object
           */
  var propertyPath: java.lang.String = js.native
}

