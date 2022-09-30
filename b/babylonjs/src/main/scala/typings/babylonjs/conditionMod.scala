package typings.babylonjs

import typings.babylonjs.actionManagerMod.ActionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("babylonjs/Actions/condition", "Condition")
  @js.native
  open class Condition protected () extends StObject {
    /**
      * Creates a new Condition
      * @param actionManager the manager of the action the condition is applied to
      */
    def this(actionManager: ActionManager) = this()
    
    /**
      * Internal only - manager for action
      * @internal
      */
    var _actionManager: ActionManager = js.native
    
    /**
      * @internal
      */
    var _currentResult: Boolean = js.native
    
    /**
      * @internal
      */
    var _evaluationId: Double = js.native
    
    /**
      * @internal
      */
    def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
    
    /**
      * @internal
      */
    def _getProperty(propertyPath: String): String = js.native
    
    /**
      * @internal
      */
    /* protected */ def _serialize(serializedCondition: Any): Any = js.native
    
    /**
      * Check if the current condition is valid
      * @returns a boolean
      */
    def isValid(): Boolean = js.native
    
    /**
      * Serialize placeholder for child classes
      * @returns the serialized object
      */
    def serialize(): Any = js.native
  }
  
  @JSImport("babylonjs/Actions/condition", "PredicateCondition")
  @js.native
  open class PredicateCondition protected () extends Condition {
    /**
      * Creates a new PredicateCondition
      * @param actionManager manager for the action the condition applies to
      * @param predicate defines the predicate function used to validate the condition
      */
    def this(
      actionManager: ActionManager,
      /** defines the predicate function used to validate the condition */
    predicate: js.Function0[Boolean]
    ) = this()
    
    /** defines the predicate function used to validate the condition */
    def predicate(): Boolean = js.native
  }
  
  @JSImport("babylonjs/Actions/condition", "StateCondition")
  @js.native
  open class StateCondition protected () extends Condition {
    /**
      * Creates a new StateCondition
      * @param actionManager manager for the action the condition applies to
      * @param target of the condition
      * @param value to compare with target state
      */
    def this(
      actionManager: ActionManager,
      target: Any,
      /** Value to compare with target state  */
    value: String
    ) = this()
    
    /* private */ var _target: Any = js.native
    
    /** Value to compare with target state  */
    var value: String = js.native
  }
  
  @JSImport("babylonjs/Actions/condition", "ValueCondition")
  @js.native
  open class ValueCondition protected () extends Condition {
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
      target: Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: Any
    ) = this()
    def this(
      actionManager: ActionManager,
      target: Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: Any,
      /** the conditional operator, default ValueCondition.IsEqual */
    operator: Double
    ) = this()
    
    /* private */ var _effectiveTarget: Any = js.native
    
    /* private */ var _property: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /** the conditional operator, default ValueCondition.IsEqual */
    var operator: Double = js.native
    
    /** path to specify the property of the target the conditional operator uses  */
    var propertyPath: String = js.native
    
    /** the value compared by the conditional operator against the current value of the property */
    var value: Any = js.native
  }
  /* static members */
  object ValueCondition {
    
    @JSImport("babylonjs/Actions/condition", "ValueCondition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the name of the conditional operator for the ValueCondition
      * @param operator the conditional operator
      * @returns the name
      */
    inline def GetOperatorName(operator: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetOperatorName")(operator.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsDifferent")
    @js.native
    def _IsDifferent: Any = js.native
    inline def _IsDifferent_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsEqual")
    @js.native
    def _IsEqual: Any = js.native
    inline def _IsEqual_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsGreater")
    @js.native
    def _IsGreater: Any = js.native
    inline def _IsGreater_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsLesser")
    @js.native
    def _IsLesser: Any = js.native
    inline def _IsLesser_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
  }
}
