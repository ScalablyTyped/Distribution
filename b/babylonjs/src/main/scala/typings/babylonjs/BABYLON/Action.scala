package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action
  extends StObject
     with IAction {
  
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
