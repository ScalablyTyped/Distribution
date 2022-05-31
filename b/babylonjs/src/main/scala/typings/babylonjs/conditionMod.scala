package typings.babylonjs

import typings.babylonjs.actionManagerMod.ActionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conditionMod {
  
  @JSImport("babylonjs/Actions/condition", "Condition")
  @js.native
  class Condition protected () extends StObject {
    /**
      * Creates a new Condition
      * @param actionManager the manager of the action the condition is applied to
      */
    def this(actionManager: ActionManager) = this()
    
    /**
      * Internal only - manager for action
      * @hidden
      */
    var _actionManager: ActionManager = js.native
    
    /**
      * Internal only
      * @hidden
      */
    var _currentResult: Boolean = js.native
    
    /**
      * Internal only
      * @hidden
      */
    var _evaluationId: Double = js.native
    
    /**
      * Internal only
      * @hidden
      */
    def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Any = js.native
    
    /**
      * Internal only
      * @hidden
      */
    def _getProperty(propertyPath: String): String = js.native
    
    /**
      * Internal only
      * @hidden
      */
    /* protected */ def _serialize(serializedCondition: js.Any): js.Any = js.native
    
    /**
      * Check if the current condition is valid
      * @returns a boolean
      */
    def isValid(): Boolean = js.native
    
    /**
      * Serialize placeholder for child classes
      * @returns the serialized object
      */
    def serialize(): js.Any = js.native
  }
  
  @JSImport("babylonjs/Actions/condition", "PredicateCondition")
  @js.native
  class PredicateCondition protected () extends Condition {
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
  class StateCondition protected () extends Condition {
    /**
      * Creates a new StateCondition
      * @param actionManager manager for the action the condition applies to
      * @param target of the condition
      * @param value to compare with target state
      */
    def this(
      actionManager: ActionManager,
      target: js.Any,
      /** Value to compare with target state  */
    value: String
    ) = this()
    
    /**
      * Internal only
      * @hidden
      */
    /* private */ var _target: js.Any = js.native
    
    /** Value to compare with target state  */
    var value: String = js.native
  }
  
  @JSImport("babylonjs/Actions/condition", "ValueCondition")
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
    /* private */ var _effectiveTarget: js.Any = js.native
    
    /**
      * Internal only
      * @hidden
      */
    /* private */ var _property: js.Any = js.native
    
    /**
      * Internal only
      * @hidden
      */
    /* private */ var _target: js.Any = js.native
    
    /** the conditional operator, default ValueCondition.IsEqual */
    var operator: Double = js.native
    
    /** path to specify the property of the target the conditional operator uses  */
    var propertyPath: String = js.native
    
    /** the value compared by the conditional operator against the current value of the property */
    var value: js.Any = js.native
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
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsDifferent")
    @js.native
    def _IsDifferent: js.Any = js.native
    inline def _IsDifferent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsEqual")
    @js.native
    def _IsEqual: js.Any = js.native
    inline def _IsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsGreater")
    @js.native
    def _IsGreater: js.Any = js.native
    inline def _IsGreater_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/condition", "ValueCondition._IsLesser")
    @js.native
    def _IsLesser: js.Any = js.native
    inline def _IsLesser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
  }
}
