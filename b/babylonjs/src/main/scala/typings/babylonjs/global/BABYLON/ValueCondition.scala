package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ValueCondition")
@js.native
class ValueCondition protected ()
  extends typings.babylonjs.BABYLON.ValueCondition {
  /**
    * Creates a new ValueCondition
    * @param actionManager manager for the action the condition applies to
    * @param target for the action
    * @param propertyPath path to specify the property of the target the conditional operator uses
    * @param value the value compared by the conditional operator against the current value of the property
    * @param operator the conditional operator, default ValueCondition.IsEqual
    */
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any
  ) = this()
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: js.Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: js.Any,
    /** the conditional operator, default ValueCondition.IsEqual */
  operator: Double
  ) = this()
  /**
    * Internal only - manager for action
    * @hidden
    */
  /* CompleteClass */
  override var _actionManager: typings.babylonjs.BABYLON.ActionManager = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _currentResult: Boolean = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _effectiveTarget: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _evaluationId: Double = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _property: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _target: js.Any = js.native
  /** the conditional operator, default ValueCondition.IsEqual */
  /* CompleteClass */
  override var operator: Double = js.native
  /** path to specify the property of the target the conditional operator uses  */
  /* CompleteClass */
  override var propertyPath: String = js.native
  /** the value compared by the conditional operator against the current value of the property */
  /* CompleteClass */
  override var value: js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override def _getProperty(propertyPath: String): String = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  /* protected */ override def _serialize(serializedCondition: js.Any): js.Any = js.native
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
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

