package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Condition")
@js.native
open class Condition protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Condition {
  /**
    * Creates a new Condition
    * @param actionManager the manager of the action the condition is applied to
    */
  def this(actionManager: typings.babylonjs.BABYLON.ActionManager) = this()
  
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
    * @param target
    * @param propertyPath
    * @hidden
    */
  /* CompleteClass */
  override def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
  
  /**
    * Internal only
    * @param propertyPath
    * @hidden
    */
  /* CompleteClass */
  override def _getProperty(propertyPath: String): String = js.native
  
  /**
    * Internal only
    * @param serializedCondition
    * @hidden
    */
  /* protected */ /* CompleteClass */
  override def _serialize(serializedCondition: Any): Any = js.native
  
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
  override def serialize(): Any = js.native
}
