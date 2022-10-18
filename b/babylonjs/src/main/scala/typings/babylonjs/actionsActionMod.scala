package typings.babylonjs

import typings.babylonjs.actionsAbstractActionManagerMod.AbstractActionManager
import typings.babylonjs.actionsActionEventMod.ActionEvent
import typings.babylonjs.actionsActionManagerMod.ActionManager
import typings.babylonjs.actionsConditionMod.Condition
import typings.babylonjs.anon.Name
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsActionMod {
  
  @JSImport("babylonjs/Actions/action", "Action")
  @js.native
  open class Action protected ()
    extends StObject
       with IAction {
    /**
      * Creates a new Action
      * @param triggerOptions the trigger, with or without parameters, for the action
      * @param condition an optional determinant of action
      */
    def this(/** the trigger, with or without parameters, for the action */
    triggerOptions: Any) = this()
    def this(
      /** the trigger, with or without parameters, for the action */
    triggerOptions: Any,
      condition: Condition
    ) = this()
    
    /**
      * Internal only - manager for action
      * @internal
      */
    @JSName("_actionManager")
    var _actionManager_Action: ActionManager = js.native
    
    /* private */ var _child: Any = js.native
    
    /* private */ var _condition: Any = js.native
    
    /**
      * Internal only - Returns if the current condition allows to run the action
      * @internal
      */
    def _evaluateConditionForCurrentFrame(): Boolean = js.native
    
    /**
      * @internal
      */
    def _getEffectiveTarget(target: Any, propertyPath: String): Any = js.native
    
    /**
      * Internal only
      * @internal
      */
    def _getProperty(propertyPath: String): String = js.native
    
    /* private */ var _nextActiveAction: Any = js.native
    
    /**
      * Internal only called by serialize
      * @internal
      */
    /* protected */ def _serialize(serializedAction: Any): Any = js.native
    /* protected */ def _serialize(serializedAction: Any, parent: Any): Any = js.native
    
    /* private */ var _triggerParameter: Any = js.native
    
    /**
      * Execute placeholder for child classes
      * @param evt optional action event
      */
    def execute(): Unit = js.native
    def execute(evt: ActionEvent): Unit = js.native
    
    /**
      * An event triggered prior to action being executed.
      */
    var onBeforeExecuteObservable: Observable[Action] = js.native
    
    /**
      * Sets the trigger parameter
      * @param value defines the new trigger parameter
      */
    def setTriggerParameter(value: Any): Unit = js.native
    
    /**
      * Skips to next active action
      */
    def skipToNextActiveAction(): Unit = js.native
    
    /**
      * Adds action to chain of actions, may be a DoNothingAction
      * @param action defines the next action to execute
      * @returns The action passed in
      * @see https://www.babylonjs-playground.com/#1T30HR#0
      */
    def `then`(action: Action): Action = js.native
  }
  /* static members */
  object Action {
    
    @JSImport("babylonjs/Actions/action", "Action")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _GetTargetProperty(target: Node): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
    /**
      * Internal only
      * @internal
      */
    inline def _GetTargetProperty(target: Scene): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetTargetProperty")(target.asInstanceOf[js.Any]).asInstanceOf[Name]
    
    /**
      * Internal only
      * @internal
      */
    inline def _SerializeValueAsString(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_SerializeValueAsString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait IAction extends StObject {
    
    /**
      * Internal only - manager for action
      * @internal
      */
    var _actionManager: Nullable[AbstractActionManager] = js.native
    
    /**
      * Internal only - executes current action event
      * @internal
      */
    def _executeCurrent(): Unit = js.native
    def _executeCurrent(evt: ActionEvent): Unit = js.native
    
    /**
      * Internal only
      * @internal
      */
    def _prepare(): Unit = js.native
    
    /**
      * Gets the trigger parameters
      * @returns the trigger parameters
      */
    def getTriggerParameter(): Any = js.native
    
    /**
      * Serialize placeholder for child classes
      * @param parent of child
      * @returns the serialized object
      */
    def serialize(parent: Any): Any = js.native
    
    /**
      * Adds action to chain of actions, may be a DoNothingAction
      * @param action defines the next action to execute
      * @returns The action passed in
      * @see https://www.babylonjs-playground.com/#1T30HR#0
      */
    def `then`(action: IAction): IAction = js.native
    
    /**
      * Trigger for the action
      */
    var trigger: Double = js.native
    
    /** Options of the trigger */
    var triggerOptions: Any = js.native
  }
}
