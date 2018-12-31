package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines a state condition as an extension of Condition
  */
@JSImport("babylonjs", "StateCondition")
@js.native
class StateCondition protected ()
  extends babylonjsLib.BABYLONNs.StateCondition {
  /**
    * Creates a new StateCondition
    * @param actionManager manager for the action the condition applies to
    * @param target of the condition
    * @param value to compare with target state
    */
  def this(actionManager: babylonjsLib.BABYLONNs.ActionManager, target: js.Any, /** Value to compare with target state  */
  value: java.lang.String) = this()
}

