package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a state condition as an extension of Condition
     */
@JSGlobal("BABYLON.StateCondition")
@js.native
class StateCondition protected () extends Condition {
  /**
           * Creates a new StateCondition
           * @param actionManager manager for the action the condition applies to
           * @param target of the condition
           * @param value to compare with target state
           */
  def this(actionManager: ActionManager, target: js.Any, /** Value to compare with target state  */
  value: java.lang.String) = this()
  /**
           * Internal only
           * @hidden
           */
  var _target: js.Any = js.native
  /** Value to compare with target state  */
  var value: java.lang.String = js.native
}

