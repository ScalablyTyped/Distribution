package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StateCondition")
@js.native
class StateCondition protected ()
  extends StObject
     with typings.babylonjs.BABYLON.StateCondition {
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
  var _actionManager: typings.babylonjs.BABYLON.ActionManager = js.native
  
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  var _currentResult: Boolean = js.native
  
  /**
    * Internal only
    * @hidden
    */
  /* CompleteClass */
  var _evaluationId: Double = js.native
  
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
  /* protected */ /* CompleteClass */
  override def _serialize(serializedCondition: js.Any): js.Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ /* CompleteClass */
  var _target: js.Any = js.native
  
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
  
  /** Value to compare with target state  */
  /* CompleteClass */
  var value: String = js.native
}
