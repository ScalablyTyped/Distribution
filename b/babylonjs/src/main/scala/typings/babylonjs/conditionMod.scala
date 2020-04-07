package typings.babylonjs

import typings.babylonjs.actionManagerMod.ActionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/condition", JSImport.Namespace)
@js.native
object conditionMod extends js.Object {
  @js.native
  class Condition protected () extends js.Object {
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
    var _target: js.Any = js.native
    /** Value to compare with target state  */
    var value: String = js.native
  }
  
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
    var operator: Double = js.native
    /** path to specify the property of the target the conditional operator uses  */
    var propertyPath: String = js.native
    /** the value compared by the conditional operator against the current value of the property */
    var value: js.Any = js.native
  }
  
  /* static members */
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
    def IsDifferent(): Double = js.native
    /**
      * returns the number for IsEqual
      */
    def IsEqual(): Double = js.native
    /**
      * Returns the number for IsGreater
      */
    def IsGreater(): Double = js.native
    /**
      * Returns the number for IsLesser
      */
    def IsLesser(): Double = js.native
  }
  
}

