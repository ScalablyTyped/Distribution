package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
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
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: String): String
  /**
    * Internal only
    * @hidden
    */
  /* protected */ def _serialize(serializedCondition: js.Any): js.Any
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  def isValid(): Boolean
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  def serialize(): js.Any
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
}

