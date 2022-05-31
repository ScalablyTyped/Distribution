package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueCondition
  extends StObject
     with Condition {
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ var _effectiveTarget: js.Any
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ var _property: js.Any
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ var _target: js.Any
  
  /** the conditional operator, default ValueCondition.IsEqual */
  var operator: Double
  
  /** path to specify the property of the target the conditional operator uses  */
  var propertyPath: String
  
  /** the value compared by the conditional operator against the current value of the property */
  var value: js.Any
}
object ValueCondition {
  
  inline def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _effectiveTarget: js.Any,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _property: js.Any,
    _serialize: js.Any => js.Any,
    _target: js.Any,
    isValid: () => Boolean,
    operator: Double,
    propertyPath: String,
    serialize: () => js.Any,
    value: js.Any
  ): ValueCondition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _effectiveTarget = _effectiveTarget.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _property = _property.asInstanceOf[js.Any], _serialize = js.Any.fromFunction1(_serialize), _target = _target.asInstanceOf[js.Any], isValid = js.Any.fromFunction0(isValid), operator = operator.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCondition]
  }
  
  extension [Self <: ValueCondition](x: Self) {
    
    inline def setOperator(value: Double): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_effectiveTarget(value: js.Any): Self = StObject.set(x, "_effectiveTarget", value.asInstanceOf[js.Any])
    
    inline def set_property(value: js.Any): Self = StObject.set(x, "_property", value.asInstanceOf[js.Any])
    
    inline def set_target(value: js.Any): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
  }
}
