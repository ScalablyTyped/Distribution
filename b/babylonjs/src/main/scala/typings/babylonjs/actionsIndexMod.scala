package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Name
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.soundMod.Sound
import typings.babylonjs.spriteMod.Sprite
import typings.babylonjs.typesMod.Nullable
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsIndexMod {
  
  @JSImport("babylonjs/Actions/index", "AbstractActionManager")
  @js.native
  abstract class AbstractActionManager ()
    extends typings.babylonjs.abstractActionManagerMod.AbstractActionManager
  /* static members */
  object AbstractActionManager {
    
    @JSImport("babylonjs/Actions/index", "AbstractActionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Does exist one action manager that handles actions of a given trigger
      * @param trigger defines the trigger to be tested
      * @return a boolean indicating whether the trigger is handeled by at least one action manager
      **/
    @JSImport("babylonjs/Actions/index", "AbstractActionManager.HasSpecificTrigger")
    @js.native
    def HasSpecificTrigger(trigger: Double): Boolean = js.native
    
    /** Gets the list of active triggers */
    @JSImport("babylonjs/Actions/index", "AbstractActionManager.Triggers")
    @js.native
    def Triggers: StringDictionary[Double] = js.native
    @scala.inline
    def Triggers_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Triggers")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Actions/index", "Action")
  @js.native
  class Action protected ()
    extends typings.babylonjs.actionMod.Action {
    /**
      * Creates a new Action
      * @param triggerOptions the trigger, with or without parameters, for the action
      * @param condition an optional determinant of action
      */
    def this(/** the trigger, with or without parameters, for the action */
    triggerOptions: js.Any) = this()
    def this(
      /** the trigger, with or without parameters, for the action */
    triggerOptions: js.Any,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  /* static members */
  object Action {
    
    @JSImport("babylonjs/Actions/index", "Action._GetTargetProperty")
    @js.native
    def _GetTargetProperty(target: Node): Name = js.native
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "Action._GetTargetProperty")
    @js.native
    def _GetTargetProperty(target: Scene): Name = js.native
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "Action._SerializeValueAsString")
    @js.native
    def _SerializeValueAsString(value: js.Any): String = js.native
  }
  
  @JSImport("babylonjs/Actions/index", "ActionEvent")
  @js.native
  class ActionEvent protected ()
    extends typings.babylonjs.actionEventMod.ActionEvent {
    /**
      * Creates a new ActionEvent
      * @param source The mesh or sprite that triggered the action
      * @param pointerX The X mouse cursor position at the time of the event
      * @param pointerY The Y mouse cursor position at the time of the event
      * @param meshUnderPointer The mesh that is currently pointed at (can be null)
      * @param sourceEvent the original (browser) event that triggered the ActionEvent
      * @param additionalData additional data for the event
      */
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh]
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.UndefOr[scala.Nothing],
      /** additional data for the event */
    additionalData: js.Any
    ) = this()
    def this(
      /** The mesh or sprite that triggered the action */
    source: js.Any,
      /** The X mouse cursor position at the time of the event */
    pointerX: Double,
      /** The Y mouse cursor position at the time of the event */
    pointerY: Double,
      /** The mesh that is currently pointed at (can be null) */
    meshUnderPointer: Nullable[AbstractMesh],
      /** the original (browser) event that triggered the ActionEvent */
    sourceEvent: js.Any,
      /** additional data for the event */
    additionalData: js.Any
    ) = this()
  }
  /* static members */
  object ActionEvent {
    
    /**
      * Helper function to auto-create an ActionEvent from a source mesh.
      * @param source The source mesh that triggered the event
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNew")
    @js.native
    def CreateNew(source: AbstractMesh, evt: Event, additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a primitive
      * @param prim defines the target primitive
      * @param pointerPos defines the pointer position
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromPrimitive")
    @js.native
    def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: Event, additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a scene. If triggered by a mesh use ActionEvent.CreateNew
      * @param scene the scene where the event occurred
      * @param evt The original (browser) event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromScene")
    @js.native
    def CreateNewFromScene(scene: Scene, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
    
    /**
      * Helper function to auto-create an ActionEvent from a source sprite
      * @param source The source sprite that triggered the event
      * @param scene Scene associated with the sprite
      * @param evt The original (browser) event
      * @param additionalData additional data for the event
      * @returns the new ActionEvent
      */
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: js.UndefOr[scala.Nothing], additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event): typings.babylonjs.actionEventMod.ActionEvent = js.native
    @JSImport("babylonjs/Actions/index", "ActionEvent.CreateNewFromSprite")
    @js.native
    def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event, additionalData: js.Any): typings.babylonjs.actionEventMod.ActionEvent = js.native
  }
  
  @JSImport("babylonjs/Actions/index", "ActionManager")
  @js.native
  class ActionManager protected ()
    extends typings.babylonjs.actionManagerMod.ActionManager {
    /**
      * Creates a new action manager
      * @param scene defines the hosting scene
      */
    def this(scene: Scene) = this()
  }
  /* static members */
  object ActionManager {
    
    /**
      * Get a trigger name by index
      * @param trigger defines the trigger index
      * @returns a trigger name
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.GetTriggerName")
    @js.native
    def GetTriggerName(trigger: Double): String = js.native
    
    /**
      * Nothing
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.NothingTrigger")
    @js.native
    val NothingTrigger: Double = js.native
    
    /**
      * On center pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnCenterPickTrigger")
    @js.native
    val OnCenterPickTrigger: Double = js.native
    
    /**
      * On double pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnDoublePickTrigger")
    @js.native
    val OnDoublePickTrigger: Double = js.native
    
    /**
      * On every frame
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnEveryFrameTrigger")
    @js.native
    val OnEveryFrameTrigger: Double = js.native
    
    /**
      * On intersection enter
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnIntersectionEnterTrigger")
    @js.native
    val OnIntersectionEnterTrigger: Double = js.native
    
    /**
      * On intersection exit
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnIntersectionExitTrigger")
    @js.native
    val OnIntersectionExitTrigger: Double = js.native
    
    /**
      * On key down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnKeyDownTrigger")
    @js.native
    val OnKeyDownTrigger: Double = js.native
    
    /**
      * On key up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnKeyUpTrigger")
    @js.native
    val OnKeyUpTrigger: Double = js.native
    
    /**
      * On left pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnLeftPickTrigger")
    @js.native
    val OnLeftPickTrigger: Double = js.native
    
    /**
      * On long press
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnLongPressTrigger")
    @js.native
    val OnLongPressTrigger: Double = js.native
    
    /**
      * On pick down
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickDownTrigger")
    @js.native
    val OnPickDownTrigger: Double = js.native
    
    /**
      * On pick out.
      * This trigger will only be raised if you also declared a OnPickDown
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickOutTrigger")
    @js.native
    val OnPickOutTrigger: Double = js.native
    
    /**
      * On pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickTrigger")
    @js.native
    val OnPickTrigger: Double = js.native
    
    /**
      * On pick up
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPickUpTrigger")
    @js.native
    val OnPickUpTrigger: Double = js.native
    
    /**
      * On pointer out
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPointerOutTrigger")
    @js.native
    val OnPointerOutTrigger: Double = js.native
    
    /**
      * On pointer over
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnPointerOverTrigger")
    @js.native
    val OnPointerOverTrigger: Double = js.native
    
    /**
      * On right pick
      * @see https://doc.babylonjs.com/how_to/how_to_use_actions#triggers
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.OnRightPickTrigger")
    @js.native
    val OnRightPickTrigger: Double = js.native
    
    /**
      * Creates a new ActionManager from a JSON data
      * @param parsedActions defines the JSON data to read from
      * @param object defines the hosting mesh
      * @param scene defines the hosting scene
      */
    @JSImport("babylonjs/Actions/index", "ActionManager.Parse")
    @js.native
    def Parse(parsedActions: js.Any, `object`: Nullable[AbstractMesh], scene: Scene): Unit = js.native
  }
  
  @JSImport("babylonjs/Actions/index", "CombineAction")
  @js.native
  class CombineAction protected ()
    extends typings.babylonjs.directActionsMod.CombineAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param children defines the list of aggregated animations to run
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, children: js.Array[typings.babylonjs.actionMod.Action]) = this()
    def this(
      triggerOptions: js.Any,
      children: js.Array[typings.babylonjs.actionMod.Action],
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "Condition")
  @js.native
  class Condition protected ()
    extends typings.babylonjs.conditionMod.Condition {
    /**
      * Creates a new Condition
      * @param actionManager the manager of the action the condition is applied to
      */
    def this(actionManager: typings.babylonjs.actionManagerMod.ActionManager) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "DoNothingAction")
  @js.native
  /**
    * Instantiate the action
    * @param triggerOptions defines the trigger options
    * @param condition defines the trigger related conditions
    */
  class DoNothingAction ()
    extends typings.babylonjs.directActionsMod.DoNothingAction {
    def this(triggerOptions: js.Any) = this()
    def this(triggerOptions: js.UndefOr[scala.Nothing], condition: typings.babylonjs.conditionMod.Condition) = this()
    def this(triggerOptions: js.Any, condition: typings.babylonjs.conditionMod.Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "ExecuteCodeAction")
  @js.native
  class ExecuteCodeAction protected ()
    extends typings.babylonjs.directActionsMod.ExecuteCodeAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param func defines the callback function to run
      * @param condition defines the trigger related conditions
      */
    def this(
      triggerOptions: js.Any,
      func: js.Function1[/* evt */ typings.babylonjs.actionEventMod.ActionEvent, Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      func: js.Function1[/* evt */ typings.babylonjs.actionEventMod.ActionEvent, Unit],
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "IncrementValueAction")
  @js.native
  class IncrementValueAction protected ()
    extends typings.babylonjs.directActionsMod.IncrementValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to increment in the target
      * @param value defines the value value we should increment the property by
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "InterpolateValueAction")
  @js.native
  class InterpolateValueAction protected ()
    extends typings.babylonjs.interpolateValueActionMod.InterpolateValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the value to interpolate
      * @param propertyPath defines the path to the property in the target object
      * @param value defines the target value at the end of the interpolation
      * @param duration deines the time it will take for the property to interpolate to the value.
      * @param condition defines the trigger related conditions
      * @param stopOtherAnimations defines if the other scene animations should be stopped when the action has been triggered
      * @param onInterpolationDone defines a callback raised once the interpolation animation has been done
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, duration: Double) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: Boolean
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: js.UndefOr[scala.Nothing],
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: js.UndefOr[scala.Nothing],
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: js.UndefOr[scala.Nothing],
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: js.UndefOr[scala.Nothing],
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: js.UndefOr[scala.Nothing],
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: js.UndefOr[scala.Nothing],
      onInterpolationDone: js.Function0[Unit]
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      duration: Double,
      condition: typings.babylonjs.conditionMod.Condition,
      stopOtherAnimations: Boolean,
      onInterpolationDone: js.Function0[Unit]
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PlayAnimationAction")
  @js.native
  class PlayAnimationAction protected ()
    extends typings.babylonjs.directActionsMod.PlayAnimationAction {
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
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      from: Double,
      to: Double,
      loop: Boolean,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PlaySoundAction")
  @js.native
  class PlaySoundAction protected ()
    extends typings.babylonjs.directAudioActionsMod.PlaySoundAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to play
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, sound: Sound) = this()
    def this(triggerOptions: js.Any, sound: Sound, condition: typings.babylonjs.conditionMod.Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "PredicateCondition")
  @js.native
  class PredicateCondition protected ()
    extends typings.babylonjs.conditionMod.PredicateCondition {
    /**
      * Creates a new PredicateCondition
      * @param actionManager manager for the action the condition applies to
      * @param predicate defines the predicate function used to validate the condition
      */
    def this(
      actionManager: typings.babylonjs.actionManagerMod.ActionManager,
      /** defines the predicate function used to validate the condition */
    predicate: js.Function0[Boolean]
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetParentAction")
  @js.native
  class SetParentAction protected ()
    extends typings.babylonjs.directActionsMod.SetParentAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target containing the parent property
      * @param parent defines from where the animation should start (animation frame)
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, parent: js.Any) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      parent: js.Any,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetStateAction")
  @js.native
  class SetStateAction protected ()
    extends typings.babylonjs.directActionsMod.SetStateAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the state property
      * @param value defines the value to store in the state field
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, value: String) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      value: String,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SetValueAction")
  @js.native
  class SetValueAction protected ()
    extends typings.babylonjs.directActionsMod.SetValueAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the property
      * @param propertyPath defines the path of the property to set in the target
      * @param value defines the value to set in the property
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      value: js.Any,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StateCondition")
  @js.native
  class StateCondition protected ()
    extends typings.babylonjs.conditionMod.StateCondition {
    /**
      * Creates a new StateCondition
      * @param actionManager manager for the action the condition applies to
      * @param target of the condition
      * @param value to compare with target state
      */
    def this(
      actionManager: typings.babylonjs.actionManagerMod.ActionManager,
      target: js.Any,
      /** Value to compare with target state  */
    value: String
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StopAnimationAction")
  @js.native
  class StopAnimationAction protected ()
    extends typings.babylonjs.directActionsMod.StopAnimationAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the target animation or animation name
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any) = this()
    def this(triggerOptions: js.Any, target: js.Any, condition: typings.babylonjs.conditionMod.Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "StopSoundAction")
  @js.native
  class StopSoundAction protected ()
    extends typings.babylonjs.directAudioActionsMod.StopSoundAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param sound defines the sound to stop
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, sound: Sound) = this()
    def this(triggerOptions: js.Any, sound: Sound, condition: typings.babylonjs.conditionMod.Condition) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "SwitchBooleanAction")
  @js.native
  class SwitchBooleanAction protected ()
    extends typings.babylonjs.directActionsMod.SwitchBooleanAction {
    /**
      * Instantiate the action
      * @param triggerOptions defines the trigger options
      * @param target defines the object containing the boolean
      * @param propertyPath defines the path to the boolean property in the target object
      * @param condition defines the trigger related conditions
      */
    def this(triggerOptions: js.Any, target: js.Any, propertyPath: String) = this()
    def this(
      triggerOptions: js.Any,
      target: js.Any,
      propertyPath: String,
      condition: typings.babylonjs.conditionMod.Condition
    ) = this()
  }
  
  @JSImport("babylonjs/Actions/index", "ValueCondition")
  @js.native
  class ValueCondition protected ()
    extends typings.babylonjs.conditionMod.ValueCondition {
    /**
      * Creates a new ValueCondition
      * @param actionManager manager for the action the condition applies to
      * @param target for the action
      * @param propertyPath path to specify the property of the target the conditional operator uses
      * @param value the value compared by the conditional operator against the current value of the property
      * @param operator the conditional operator, default ValueCondition.IsEqual
      */
    def this(
      actionManager: typings.babylonjs.actionManagerMod.ActionManager,
      target: js.Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: js.Any
    ) = this()
    def this(
      actionManager: typings.babylonjs.actionManagerMod.ActionManager,
      target: js.Any,
      /** path to specify the property of the target the conditional operator uses  */
    propertyPath: String,
      /** the value compared by the conditional operator against the current value of the property */
    value: js.Any,
      /** the conditional operator, default ValueCondition.IsEqual */
    operator: Double
    ) = this()
  }
  /* static members */
  object ValueCondition {
    
    @JSImport("babylonjs/Actions/index", "ValueCondition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the name of the conditional operator for the ValueCondition
      * @param operator the conditional operator
      * @returns the name
      */
    @JSImport("babylonjs/Actions/index", "ValueCondition.GetOperatorName")
    @js.native
    def GetOperatorName(operator: Double): String = js.native
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsDifferent")
    @js.native
    def _IsDifferent: js.Any = js.native
    @scala.inline
    def _IsDifferent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsDifferent")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsEqual")
    @js.native
    def _IsEqual: js.Any = js.native
    @scala.inline
    def _IsEqual_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsEqual")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsGreater")
    @js.native
    def _IsGreater: js.Any = js.native
    @scala.inline
    def _IsGreater_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsGreater")(x.asInstanceOf[js.Any])
    
    /**
      * Internal only
      * @hidden
      */
    @JSImport("babylonjs/Actions/index", "ValueCondition._IsLesser")
    @js.native
    def _IsLesser: js.Any = js.native
    @scala.inline
    def _IsLesser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsLesser")(x.asInstanceOf[js.Any])
  }
}
