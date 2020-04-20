package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ValueCondition")
@js.native
class ValueCondition protected () extends Condition {
  /**
    * Creates a new ValueCondition
    * @param actionManager manager for the action the condition applies to
    * @param target for the action
    * @param propertyPath path to specify the property of the target the conditional operator uses
    * @param value the value compared by the conditional operator against the current value of the property
    * @param operator the conditional operator, default ValueCondition.IsEqual
    */
  def this(
    actionManager: ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any
  ) = this()
  def this(
    actionManager: ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any,
    /** the conditional operator, default ValueCondition.IsEqual */
  operator: Double
  ) = this()
  /**
    * Internal only
    * @hidden
    */
  var _effectiveTarget: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _property: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _target: js.Any = js.native
  /** the conditional operator, default ValueCondition.IsEqual */
  var operator: Double = js.native
  /** path to specify the property of the target the conditional operator uses  */
  var propertyPath: String = js.native
  /** the value compared by the conditional operator against the current value of the property */
  var value: js.Any = js.native
}

/* static members */
@JSGlobal("BABYLON.ValueCondition")
@js.native
object ValueCondition extends js.Object {
  /**
    * Internal only
    * @hidden
    */
  var _IsDifferent: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _IsEqual: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _IsGreater: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  var _IsLesser: js.Any = js.native
  /**
    * Gets the name of the conditional operator for the ValueCondition
    * @param operator the conditional operator
    * @returns the name
    */
  def GetOperatorName(operator: Double): String = js.native
  /**
    * Returns the number for IsDifferent
    */
  def IsDifferent: Double = js.native
  /**
    * returns the number for IsEqual
    */
  def IsEqual: Double = js.native
  /**
    * Returns the number for IsGreater
    */
  def IsGreater: Double = js.native
  /**
    * Returns the number for IsLesser
    */
  def IsLesser: Double = js.native
}

