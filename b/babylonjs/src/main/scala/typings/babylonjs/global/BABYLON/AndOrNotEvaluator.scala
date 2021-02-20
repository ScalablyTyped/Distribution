package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AndOrNotEvaluator")
@js.native
class AndOrNotEvaluator ()
  extends typings.babylonjs.BABYLON.AndOrNotEvaluator
/* static members */
object AndOrNotEvaluator {
  
  @JSGlobal("BABYLON.AndOrNotEvaluator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Evaluate a query
    * @param query defines the query to evaluate
    * @param evaluateCallback defines the callback used to filter result
    * @returns true if the query matches
    */
  @JSGlobal("BABYLON.AndOrNotEvaluator.Eval")
  @js.native
  def Eval(query: String, evaluateCallback: js.Function1[/* val */ js.Any, Boolean]): Boolean = js.native
  
  @JSGlobal("BABYLON.AndOrNotEvaluator._HandleParenthesisContent")
  @js.native
  def _HandleParenthesisContent: js.Any = js.native
  @scala.inline
  def _HandleParenthesisContent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HandleParenthesisContent")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.AndOrNotEvaluator._SimplifyNegation")
  @js.native
  def _SimplifyNegation: js.Any = js.native
  @scala.inline
  def _SimplifyNegation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SimplifyNegation")(x.asInstanceOf[js.Any])
}
