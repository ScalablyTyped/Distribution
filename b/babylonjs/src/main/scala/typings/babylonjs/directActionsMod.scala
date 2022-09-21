package typings.babylonjs

import typings.babylonjs.actionEventMod.ActionEvent
import typings.babylonjs.actionMod.Action
import typings.babylonjs.conditionMod.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directActionsMod {
  
  @JSImport("babylonjs/Actions/directActions", "CombineAction")
  @js.native
  open class CombineAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param children defines the list of aggregated animations to run
      * @param condition defines the trigger related conditions
      * @param enableChildrenConditions defines if the children actions conditions should be check before execution
      */
    def this(triggerOptions: Any, children: js.Array[Action]) = this()
    def this(triggerOptions: Any, children: js.Array[Action], condition: Condition) = this()
    def this(
      triggerOptions: Any,
      children: js.Array[Action],
      condition: Unit,
      enableChildrenConditions: Boolean
    ) = this()
    def this(
      triggerOptions: Any,
      children: js.Array[Action],
      condition: Condition,
      enableChildrenConditions: Boolean
    ) = this()
    
    /**
      * The list of aggregated animations to run.
      */
    var children: js.Array[Action] = js.native
    
    /**
      * defines if the children actions conditions should be check before execution
      */
    var enableChildrenConditions: Boolean = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "DoNothingAction")
  @js.native
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param condition defines the trigger related conditions
    */
  open class DoNothingAction () extends Action {
    def this(triggerOptions: Any) = this()
    def this(triggerOptions: Any, condition: Condition) = this()
    def this(triggerOptions: Unit, condition: Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/directActions", "ExecuteCodeAction")
  @js.native
  open class ExecuteCodeAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param func defines the callback function to run
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, func: js.Function1[/* evt */ ActionEvent, Unit]) = this()
    def this(triggerOptions: Any, func: js.Function1[/* evt */ ActionEvent, Unit], condition: Condition) = this()
    
    /**
      * The callback function to run.
      */
    def func(evt: ActionEvent): Unit = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "IncrementValueAction")
  @js.native
  open class IncrementValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to increment in the target
      * @param value defines the value value we should increment the property by
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition) = this()
    
    /* private */ var _effectiveTarget: Any = js.native
    
    /* private */ var _property: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * The path of the property to increment in the target.
      */
    var propertyPath: String = js.native
    
    /**
      * The value we should increment the property by.
      */
    var value: Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "PlayAnimationAction")
  @js.native
  open class PlayAnimationAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param from defines from where the animation should start (animation frame)
      * @param to defines where the animation should stop (animation frame)
      * @param loop defines if the animation should loop or stop after the first play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, from: Double, to: Double) = this()
    def this(triggerOptions: Any, target: Any, from: Double, to: Double, loop: Boolean) = this()
    def this(triggerOptions: Any, target: Any, from: Double, to: Double, loop: Boolean, condition: Condition) = this()
    def this(triggerOptions: Any, target: Any, from: Double, to: Double, loop: Unit, condition: Condition) = this()
    
    /* private */ var _target: Any = js.native
    
    /**
      * Where the animation should start (animation frame)
      */
    var from: Double = js.native
    
    /**
      * Define if the animation should loop or stop after the first play.
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * Where the animation should stop (animation frame)
      */
    var to: Double = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "SetParentAction")
  @js.native
  open class SetParentAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target containing the parent property
      * @param parent defines from where the animation should start (animation frame)
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, parent: Any) = this()
    def this(triggerOptions: Any, target: Any, parent: Any, condition: Condition) = this()
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _target: Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "SetStateAction")
  @js.native
  open class SetStateAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the state property
      * @param value defines the value to store in the state field
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, value: String) = this()
    def this(triggerOptions: Any, target: Any, value: String, condition: Condition) = this()
    
    /* private */ var _target: Any = js.native
    
    /**
      * The value to store in the state field.
      */
    var value: String = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "SetValueAction")
  @js.native
  open class SetValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to set in the target
      * @param value defines the value to set in the property
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any) = this()
    def this(triggerOptions: Any, target: Any, propertyPath: String, value: Any, condition: Condition) = this()
    
    /* private */ var _effectiveTarget: Any = js.native
    
    /* private */ var _property: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * The path of the property to set in the target.
      */
    var propertyPath: String = js.native
    
    /**
      * The value to set in the property
      */
    var value: Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "StopAnimationAction")
  @js.native
  open class StopAnimationAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any) = this()
    def this(triggerOptions: Any, target: Any, condition: Condition) = this()
    
    /* private */ var _target: Any = js.native
  }
  
  @JSImport("babylonjs/Actions/directActions", "SwitchBooleanAction")
  @js.native
  open class SwitchBooleanAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the boolean
      * @param propertyPath defines the path to the boolean property in the target object
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: Any, target: Any, propertyPath: String) = this()
    def this(triggerOptions: Any, target: Any, propertyPath: String, condition: Condition) = this()
    
    /* private */ var _effectiveTarget: Any = js.native
    
    /* private */ var _property: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /**
      * The path to the boolean property in the target object
      */
    var propertyPath: String = js.native
  }
}
