package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredicateCondition
  extends StObject
     with Condition {
  
  /** defines the predicate function used to validate the condition */
  def predicate(): Boolean
}
object PredicateCondition {
  
  inline def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _serialize: js.Any => js.Any,
    isValid: () => Boolean,
    predicate: () => Boolean,
    serialize: () => js.Any
  ): PredicateCondition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), isValid = js.Any.fromFunction0(isValid), predicate = js.Any.fromFunction0(predicate), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[PredicateCondition]
  }
  
  extension [Self <: PredicateCondition](x: Self) {
    
    inline def setPredicate(value: () => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction0(value))
  }
}
