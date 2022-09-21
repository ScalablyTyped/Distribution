package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ValueCondition")
@js.native
open class ValueCondition protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ValueCondition {
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
    target: Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: Any
  ) = this()
  def this(
    actionManager: typings.babylonjs.BABYLON.ActionManager,
    target: Any,
    /** path to specify the property of the target the conditional operator uses  */
  propertyPath: String,
    /** the value compared by the conditional operator against the current value of the property */
  value: Any,
    /** the conditional operator, default ValueCondition.IsEqual */
  operator: Double
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
  /* private */ /* CompleteClass */
  var _effectiveTarget: Any = js.native
  
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
    * @hidden
    */
  /* private */ /* CompleteClass */
  var _property: Any = js.native
  
  /**
    * Internal only
    * @param serializedCondition
    * @hidden
    */
  /* protected */ /* CompleteClass */
  override def _serialize(serializedCondition: Any): Any = js.native
  
  /**
    * Internal only
    * @hidden
    */
  /* private */ /* CompleteClass */
  var _target: Any = js.native
  
  /**
    * Check if the current condition is valid
    * @returns a boolean
    */
  /* CompleteClass */
  override def isValid(): Boolean = js.native
  
  /** the conditional operator, default ValueCondition.IsEqual */
  /* CompleteClass */
  var operator: Double = js.native
  
  /** path to specify the property of the target the conditional operator uses  */
  /* CompleteClass */
  var propertyPath: String = js.native
  
  /**
    * Serialize placeholder for child classes
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  /** the value compared by the conditional operator against the current value of the property */
  /* CompleteClass */
  var value: Any = js.native
}
/* static members */
object ValueCondition {
  
  @JSGlobal("BABYLON.ValueCondition")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the name of the conditional operator for the ValueCondition
    * @param operator the conditional operator
    * @returns the name
    */
  inline def GetOperatorName(operator: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOperatorName")(operator.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsDifferent")
  @js.native
  def _IsDifferent: Any = js.native
  inline def _IsDifferent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsEqual")
  @js.native
  def _IsEqual: Any = js.native
  inline def _IsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsGreater")
  @js.native
  def _IsGreater: Any = js.native
  inline def _IsGreater_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
  
  /**
    * Internal only
    * @hidden
    */
  @JSGlobal("BABYLON.ValueCondition._IsLesser")
  @js.native
  def _IsLesser: Any = js.native
  inline def _IsLesser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
}
