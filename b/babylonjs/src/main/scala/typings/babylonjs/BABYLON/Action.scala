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
    * @hidden
    */
  @JSName("_actionManager")
  var _actionManager_Action: ActionManager = js.native
  
  /* private */ var _child: js.Any = js.native
  
  /* private */ var _condition: js.Any = js.native
  
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
  
  /* private */ var _nextActiveAction: js.Any = js.native
  
  /**
    * Internal only called by serialize
    * @hidden
    */
  /* protected */ def _serialize(serializedAction: js.Any): js.Any = js.native
  /* protected */ def _serialize(serializedAction: js.Any, parent: js.Any): js.Any = js.native
  
  /* private */ var _triggerParameter: js.Any = js.native
  
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
