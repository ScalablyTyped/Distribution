package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PredicateCondition")
@js.native
class PredicateCondition protected ()
  extends typings.babylonjs.BABYLON.PredicateCondition {
  /**
    * Creates a new PredicateCondition
    * @param actionManager manager for the action the condition applies to
    * @param predicate defines the predicate function used to validate the condition
    */
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    /** defines the predicate function used to validate the condition */
  predicate: js.Function0[Boolean]
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
  /** defines the predicate function used to validate the condition */
  /* CompleteClass */
  override def predicate(): Boolean = js.native
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
}

