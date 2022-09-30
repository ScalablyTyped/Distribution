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
    * @internal
    */
  /* CompleteClass */
  var _actionManager: typings.babylonjs.BABYLON.ActionManager = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var _currentResult: Boolean = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  var _evaluationId: Double = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
  
  /**
    * @internal
    */
  /* CompleteClass */
  override def _getProperty(propertyPath: String): String = js.native
  
  /**
    * @internal
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
