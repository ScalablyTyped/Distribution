package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "AndOrNotEvaluator")
@js.native
class AndOrNotEvaluator ()
  extends typings.babylonjs.indexMod.AndOrNotEvaluator
/* static members */
object AndOrNotEvaluator {
  
  @JSImport("babylonjs/Legacy/legacy", "AndOrNotEvaluator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Evaluate a query
    * @param query defines the query to evaluate
    * @param evaluateCallback defines the callback used to filter result
    * @returns true if the query matches
    */
  @JSImport("babylonjs/Legacy/legacy", "AndOrNotEvaluator.Eval")
  @js.native
  def Eval(query: String, evaluateCallback: js.Function1[/* val */ js.Any, Boolean]): Boolean = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "AndOrNotEvaluator._HandleParenthesisContent")
  @js.native
  def _HandleParenthesisContent: js.Any = js.native
  @scala.inline
  def _HandleParenthesisContent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HandleParenthesisContent")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "AndOrNotEvaluator._SimplifyNegation")
  @js.native
  def _SimplifyNegation: js.Any = js.native
  @scala.inline
  def _SimplifyNegation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifyNegation")(x.asInstanceOf[js.Any])
}
