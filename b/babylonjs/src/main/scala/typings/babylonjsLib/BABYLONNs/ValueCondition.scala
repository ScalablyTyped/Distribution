package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines specific conditional operators as extensions of Condition
     */
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
  def this(actionManager: ActionManager, target: js.Any, /** path to specify the property of the target the conditional operator uses  */
  propertyPath: java.lang.String, /** the value compared by the conditional operator against the current value of the property */
  value: js.Any) = this()
  /**
           * Creates a new ValueCondition
           * @param actionManager manager for the action the condition applies to
           * @param target for the action
           * @param propertyPath path to specify the property of the target the conditional operator uses
           * @param value the value compared by the conditional operator against the current value of the property
           * @param operator the conditional operator, default ValueCondition.IsEqual
           */
  def this(actionManager: ActionManager, target: js.Any, /** path to specify the property of the target the conditional operator uses  */
  propertyPath: java.lang.String, /** the value compared by the conditional operator against the current value of the property */
  value: js.Any, /** the conditional operator, default ValueCondition.IsEqual */
  operator: scala.Double) = this()
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
  var operator: scala.Double = js.native
  /** path to specify the property of the target the conditional operator uses  */
  var propertyPath: java.lang.String = js.native
  /** the value compared by the conditional operator against the current value of the property */
  var value: js.Any = js.native
}

/**
     * Defines specific conditional operators as extensions of Condition
     */
@JSGlobal("BABYLON.ValueCondition")
@js.native
object ValueCondition extends js.Object {
  /**
           * Returns the number for IsDifferent
           */
  val IsDifferent: scala.Double = js.native
  /**
           * returns the number for IsEqual
           */
  val IsEqual: scala.Double = js.native
  /**
           * Returns the number for IsGreater
           */
  val IsGreater: scala.Double = js.native
  /**
           * Returns the number for IsLesser
           */
  val IsLesser: scala.Double = js.native
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
  def GetOperatorName(operator: scala.Double): java.lang.String = js.native
}

