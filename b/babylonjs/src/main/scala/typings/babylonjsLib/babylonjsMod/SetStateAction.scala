package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action responsible to set a the state field of the target
  *  to a desired value once triggered.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSImport("babylonjs", "SetStateAction")
@js.native
class SetStateAction protected ()
  extends babylonjsLib.BABYLONNs.SetStateAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param target defines the object containing the state property
    * @param value defines the value to store in the state field
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, target: js.Any, value: java.lang.String) = this()
  def this(triggerOptions: js.Any, target: js.Any, value: java.lang.String, condition: babylonjsLib.BABYLONNs.Condition) = this()
}

