package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Condition extends js.Object {
  
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: ActionManager = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _currentResult: Boolean = js.native
  
  /**
    * Internal only
    * @hidden
    */
  var _evaluationId: Double = js.native
  
  /**
    * Internal only
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: String): String = js.native
  
  /**
    * Internal only
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: js.Any): js.Any = js.native
  
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): Boolean = js.native
  
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
}
object Condition {
  
  @scala.inline
  def apply(
    _actionManager: ActionManager,
    _currentResult: Boolean,
    _evaluationId: Double,
    _getEffectiveTarget: (js.Any, String) => js.Any,
    _getProperty: String => String,
    _serialize: js.Any => js.Any,
    isValid: () => Boolean,
    serialize: () => js.Any
  ): Condition = {
    val __obj = js.Dynamic.literal(_actionManager = _actionManager.asInstanceOf[js.Any], _currentResult = _currentResult.asInstanceOf[js.Any], _evaluationId = _evaluationId.asInstanceOf[js.Any], _getEffectiveTarget = js.Any.fromFunction2(_getEffectiveTarget), _getProperty = js.Any.fromFunction1(_getProperty), _serialize = js.Any.fromFunction1(_serialize), isValid = js.Any.fromFunction0(isValid), serialize = js.Any.fromFunction0(serialize))
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_actionManager(value: ActionManager): Self = this.set("_actionManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_currentResult(value: Boolean): Self = this.set("_currentResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_evaluationId(value: Double): Self = this.set("_evaluationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_getEffectiveTarget(value: (js.Any, String) => js.Any): Self = this.set("_getEffectiveTarget", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_getProperty(value: String => String): Self = this.set("_getProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_serialize(value: js.Any => js.Any): Self = this.set("_serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = this.set("serialize", js.Any.fromFunction0(value))
  }
}
