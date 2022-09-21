package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: ActionManager
  
  /**
    * Internal only
    * @hidden
    */
  var _currentResult: Boolean
  
  /**
    * Internal only
    * @hidden
    */
  var _evaluationId: Double
  
  /**
    * Internal only
    * @param target
    * @param propertyPath
    * @hidden
    */
  def _getEffectiveTarget(target: Any, propertyPath: String): Any
  
  /**
    * Internal only
    * @param propertyPath
    * @hidden
    */
  def _getProperty(propertyPath: String): String
  
  /**
    * Internal only
    * @param serializedCondition
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: Any): Any
  
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): Boolean
  
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): Any
}
object Condition {
  
  inline def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (Any, String) => Any,
    _getProperty: String => String,
    _serialize: Any => Any,
    isValid: () => Boolean,
    serialize: () => Any
  ): Condition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), isValid = js.Any.fromFunction0(isValid), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def set_actionManager(value: ActionManager): Self = StObject.set(x, "_actionManager", value.asInstanceOf[js.Any])
    
    inline def set_currentResult(value: Boolean): Self = StObject.set(x, "_currentResult", value.asInstanceOf[js.Any])
    
    inline def set_evaluationId(value: Double): Self = StObject.set(x, "_evaluationId", value.asInstanceOf[js.Any])
    
    inline def set_getEffectiveTarget(value: (Any, String) => Any): Self = StObject.set(x, "_getEffectiveTarget", js.Any.fromFunction2(value))
    
    inline def set_getProperty(value: String => String): Self = StObject.set(x, "_getProperty", js.Any.fromFunction1(value))
    
    inline def set_serialize(value: Any => Any): Self = StObject.set(x, "_serialize", js.Any.fromFunction1(value))
  }
}
