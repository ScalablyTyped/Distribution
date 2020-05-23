package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueCondition extends Condition {
  /**
    * Internal only
    * @hidden
    */
  var _effectiveTarget: js.Any
  /**
    * Internal only
    * @hidden
    */
  var _property: js.Any
  /**
    * Internal only
    * @hidden
    */
  var _target: js.Any
  /** the conditional operator, default ValueCondition.IsEqual */
  var operator: Double
  /** path to specify the property of the target the conditional operator uses  */
  var propertyPath: String
  /** the value compared by the conditional operator against the current value of the property */
  var value: js.Any
}

object ValueCondition {
  @scala.inline
  def apply(
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
}

