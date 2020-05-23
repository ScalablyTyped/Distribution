package typings.babylonjs

import typings.babylonjs.abstractActionManagerMod.AbstractActionManager
import typings.babylonjs.actionEventMod.ActionEvent
import typings.babylonjs.actionManagerMod.ActionManager
import typings.babylonjs.anon.Name
import typings.babylonjs.conditionMod.Condition
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Actions/action", JSImport.Namespace)
@js.native
object actionMod extends js.Object {
  @js.native
  class Action protected () extends IAction {
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
      condition: Condition
    ) = this()
    /**
      * Internal only - manager for action
      * @hidden
      */
    @JSName("_actionManager")
    var _actionManager_Action: ActionManager = js.native
    var _child: js.Any = js.native
    var _condition: js.UndefOr[js.Any] = js.native
    var _nextActiveAction: js.Any = js.native
    var _triggerParameter: js.Any = js.native
    /**
      * An event triggered prior to action being executed.
      */
    var onBeforeExecuteObservable: Observable[Action] = js.native
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
      * Internal only called by serialize
      * @hidden
      */
    /* protected */ def _serialize(serializedAction: js.Any): js.Any = js.native
    /* protected */ def _serialize(serializedAction: js.Any, parent: js.Any): js.Any = js.native
    /**
      * Execute placeholder for child classes
      * @param evt optional action event
      */
    def execute(): Unit = js.native
    def execute(evt: ActionEvent): Unit = js.native
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
  
  @js.native
  trait IAction extends js.Object {
    /**
      * Internal only - manager for action
      * @hidden
      */
    var _actionManager: AbstractActionManager = js.native
    /**
      * Trigger for the action
      */
    var trigger: Double = js.native
    /** Options of the trigger */
    var triggerOptions: js.Any = js.native
    /**
      * Internal only - executes current action event
      * @hidden
      */
    def _executeCurrent(): Unit = js.native
    def _executeCurrent(evt: ActionEvent): Unit = js.native
    /**
      * Internal only
      * @hidden
      */
    def _prepare(): Unit = js.native
    /**
      * Gets the trigger parameters
      * @returns the trigger parameters
      */
    def getTriggerParameter(): js.Any = js.native
    /**
      * Serialize placeholder for child classes
      * @param parent of child
      * @returns the serialized object
      */
    def serialize(parent: js.Any): js.Any = js.native
    /**
      * Adds action to chain of actions, may be a DoNothingAction
      * @param action defines the next action to execute
      * @returns The action passed in
      * @see https://www.babylonjs-playground.com/#1T30HR#0
      */
    def `then`(action: IAction): IAction = js.native
  }
  
  /* static members */
  @js.native
  object Action extends js.Object {
    /**
      * Internal only
      * @hidden
      */
    def _GetTargetProperty(target: Node): Name = js.native
    def _GetTargetProperty(target: Scene): Name = js.native
    /**
      * Internal only
      * @hidden
      */
    def _SerializeValueAsString(value: js.Any): String = js.native
  }
  
}

