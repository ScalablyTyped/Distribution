package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This defines an action responsible to trigger several actions once triggered.
     * @see http://doc.babylonjs.com/how_to/how_to_use_actions
     */
@JSGlobal("BABYLON.CombineAction")
@js.native
class CombineAction protected () extends Action {
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param children defines the list of aggregated animations to run
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, children: js.Array[Action]) = this()
  /**
           * Instantiate the action
           * @param triggerOptions defines the trigger options
           * @param children defines the list of aggregated animations to run
           * @param condition defines the trigger related conditions
           */
  def this(triggerOptions: js.Any, children: js.Array[Action], condition: Condition) = this()
  /**
           * The list of aggregated animations to run.
           */
  var children: js.Array[Action] = js.native
}

