package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateCondition
  extends StObject
     with Condition {
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ var _target: Any
  
  /** Value to compare with target state  */
  var value: String
}
object StateCondition {
  
  inline def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (Any, String) => Any,
    _getProperty: String => String,
    _serialize: Any => Any,
    _target: Any,
    isValid: () => Boolean,
    serialize: () => Any,
    value: String
  ): StateCondition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), _target = _target.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), serialize = js.Any.fromFunction0(serialize), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCondition]
  }
  
  extension [Self <: StateCondition](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_target(value: Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
  }
}
