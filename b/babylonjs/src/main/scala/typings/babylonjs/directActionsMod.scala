package typings.babylonjs

import typings.babylonjs.actionEventMod.ActionEvent
import typings.babylonjs.actionMod.Action
import typings.babylonjs.conditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Actions/directActions", JSImport.Namespace)
@js.native
object directActionsMod extends js.Object {
  
  @js.native
  class CombineAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param children defines the list of aggregated animations to run
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, children: js.Array[Action]) = this()
    def this(triggerOptions: js.Any, children: js.Array[Action], condition: Condition) = this()
    
    /**
      * The list of aggregated animations to run.
      */
    var children: js.Array[Action] = js.native
  }
  
  @js.native
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param condition defines the trigger related conditions
    */
  class DoNothingAction () extends Action {
    def this(triggerOptions: js.Any) = this()
    def this(triggerOptions: js.UndefOr[scala.Nothing], condition: Condition) = this()
    def this(triggerOptions: js.Any, condition: Condition) = this()
  }
  
  @js.native
  class ExecuteCodeAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param func defines the callback function to run
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, Unit]) = this()
    def this(triggerOptions: js.Any, func: js.Function1[/* evt */ ActionEvent, Unit], condition: Condition) = this()
    
    /**
      * The callback function to run.
      */
    def func(evt: ActionEvent): Unit = js.native
  }
  
  @js.native
  class IncrementValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to increment in the target
      * @param value defines the value value we should increment the property by
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition) = this()
    
    var _effectiveTarget: js.Any = js.native
    
    var _property: js.Any = js.native
    
    var _target: js.Any = js.native
    
    /**
      * The path of the property to increment in the target.
      */
    var propertyPath: String = js.native
    
    /**
      * The value we should increment the property by.
      */
    var value: js.Any = js.native
  }
  
  @js.native
  class PlayAnimationAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param from defines from where the animation should start (animation frame)
      * @param end defines where the animation should stop (animation frame)
      * @param loop defines if the animation should loop or stop after the first play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double) = this()
    def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double, loop: Boolean) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      from: Double,
      to: Double,
      loop: js.UndefOr[scala.Nothing],
      condition: Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      from: Double,
      to: Double,
      loop: Boolean,
      condition: Condition
    ) = this()
    
    var _target: js.Any = js.native
    
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
  
  @js.native
  class SetParentAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target containing the parent property
      * @param parent defines from where the animation should start (animation frame)
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, parent: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, parent: js.Any, condition: Condition) = this()
    
    var _parent: js.Any = js.native
    
    var _target: js.Any = js.native
  }
  
  @js.native
  class SetStateAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the state property
      * @param value defines the value to store in the state field
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, value: String) = this()
    def this(triggerOptions: js.Any, target: js.Any, value: String, condition: Condition) = this()
    
    var _target: js.Any = js.native
    
    /**
      * The value to store in the state field.
      */
    var value: String = js.native
  }
  
  @js.native
  class SetValueAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to set in the target
      * @param value defines the value to set in the property
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition) = this()
    
    var _effectiveTarget: js.Any = js.native
    
    var _property: js.Any = js.native
    
    var _target: js.Any = js.native
    
    /**
      * The path of the property to set in the target.
      */
    var propertyPath: String = js.native
    
    /**
      * The value to set in the property
      */
    var value: js.Any = js.native
  }
  
  @js.native
  class StopAnimationAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, condition: Condition) = this()
    
    var _target: js.Any = js.native
  }
  
  @js.native
  class SwitchBooleanAction protected () extends Action {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the boolean
      * @param propertyPath defines the path to the boolean property in the target object
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String) = this()
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, condition: Condition) = this()
    
    var _effectiveTarget: js.Any = js.native
    
    var _property: js.Any = js.native
    
    var _target: js.Any = js.native
    
    /**
      * The path to the boolean property in the target object
      */
    var propertyPath: String = js.native
  }
}
