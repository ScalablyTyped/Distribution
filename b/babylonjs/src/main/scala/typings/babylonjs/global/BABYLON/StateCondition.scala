package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.StateCondition")
@js.native
class StateCondition protected ()
  extends typings.babylonjs.BABYLON.StateCondition {
  /**
    * Creates a new StateCondition
    * @param actionManager manager for the action the condition applies to
    * @param target of the condition
    * @param value to compare with target state
    */
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: js.Any,
    /** Value to compare with target state  */
  value: String
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
  override var _evaluationId: Double = js.native
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  override var _target: js.Any = js.native
  /** Value to compare with target state  */
  /* CompleteClass */
  override var value: String = js.native
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

