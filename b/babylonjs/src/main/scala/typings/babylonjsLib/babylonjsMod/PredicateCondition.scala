package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines a predicate condition as an extension of Condition
     */
@JSImport("babylonjs", "PredicateCondition")
@js.native
class PredicateCondition protected ()
  extends babylonjsLib.BABYLONNs.PredicateCondition {
  /**
           * Creates a new PredicateCondition
           * @param actionManager manager for the action the condition applies to
           * @param predicate defines the predicate function used to validate the condition
           */
  def this(actionManager: babylonjsLib.BABYLONNs.ActionManager, /** defines the predicate function used to validate the condition */
  predicate: js.Function0[scala.Boolean]) = this()
}

