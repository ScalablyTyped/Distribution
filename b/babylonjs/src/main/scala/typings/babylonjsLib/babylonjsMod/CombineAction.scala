package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This defines an action responsible to trigger several actions once triggered.
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions
  */
@JSImport("babylonjs", "CombineAction")
@js.native
class CombineAction protected ()
  extends babylonjsLib.BABYLONNs.CombineAction {
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param children defines the list of aggregated animations to run
    * @param condition defines the trigger related conditions
    */
  def this(triggerOptions: js.Any, children: js.Array[babylonjsLib.BABYLONNs.Action]) = this()
  def this(triggerOptions: js.Any, children: js.Array[babylonjsLib.BABYLONNs.Action], condition: babylonjsLib.BABYLONNs.Condition) = this()
}

