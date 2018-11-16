package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a predicate condition as an extension of Condition
     */
@JSGlobal("BABYLON.PredicateCondition")
@js.native
class PredicateCondition protected () extends Condition {
  /**
           * Creates a new PredicateCondition
           * @param actionManager manager for the action the condition applies to
           * @param predicate defines the predicate function used to validate the condition
           */
  def this(actionManager: ActionManager, /** defines the predicate function used to validate the condition */
  predicate: js.Function0[scala.Boolean]) = this()
  /** defines the predicate function used to validate the condition */
  def predicate(): scala.Boolean = js.native
}

