package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The action to be carried out following a trigger
  * @see http://doc.babylonjs.com/how_to/how_to_use_actions#available-actions
  */
@JSGlobal("BABYLON.Action")
@js.native
class Action protected () extends js.Object {
  /**
    * Creates a new Action
    * @param triggerOptions the trigger, with or without parameters, for the action
    * @param condition an optional determinant of action
    */
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any) = this()
  def this(/** the trigger, with or without parameters, for the action */
  triggerOptions: js.Any, condition: Condition) = this()
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: ActionManager = js.native
  var _child: js.Any = js.native
  var _condition: js.UndefOr[js.Any] = js.native
  var _nextActiveAction: js.Any = js.native
  var _triggerParameter: js.Any = js.native
  /**
    * An event triggered prior to action being executed.
    */
  var onBeforeExecuteObservable: Observable[Action] = js.native
  /**
    * Trigger for the action
    */
  var trigger: scala.Double = js.native
  /** the trigger, with or without parameters, for the action */
  var triggerOptions: js.Any = js.native
  /**
    * Internal only - executes current action event
    * @hidden
    */
  def _executeCurrent(): scala.Unit = js.native
  def _executeCurrent(evt: ActionEvent): scala.Unit = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getEffectiveTarget(target: js.Any, propertyPath: java.lang.String): js.Any = js.native
  /**
    * Internal only
    * @hidden
    */
  def _getProperty(propertyPath: java.lang.String): java.lang.String = js.native
  /**
    * Internal only
    * @hidden
    */
  def _prepare(): scala.Unit = js.native
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
  def execute(): scala.Unit = js.native
  def execute(evt: ActionEvent): scala.Unit = js.native
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
    * Skips to next active action
    */
  def skipToNextActiveAction(): scala.Unit = js.native
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
  def _GetTargetProperty(target: babylonjsLib.BABYLONNs.Node): babylonjsLib.Anon_Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _GetTargetProperty(target: babylonjsLib.BABYLONNs.Scene): babylonjsLib.Anon_Name = js.native
  /**
    * Internal only
    * @hidden
    */
  def _SerializeValueAsString(value: js.Any): java.lang.String = js.native
}

