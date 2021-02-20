package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAction extends StObject {
  
  /**
    * Internal only - manager for action
    * @hidden
    */
  var _actionManager: Nullable[AbstractActionManager] = js.native
  
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
  
  /**
    * Trigger for the action
    */
  var trigger: Double = js.native
  
  /** Options of the trigger */
  var triggerOptions: js.Any = js.native
}
