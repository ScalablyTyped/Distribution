package typings.babylonjs.BABYLON

import typings.babylonjs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Action")
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

/* static members */
@JSGlobal("BABYLON.Action")
@js.native
object Action extends js.Object {
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: Node): AnonName = js.native
  def _GetTargetProperty(target: Scene): AnonName = js.native
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): String = js.native
}

