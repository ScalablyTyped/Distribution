package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractActionManager
  extends StObject
     with IDisposable {
  
  /** Gets the list of actions */
  var actions: js.Array[IAction] = js.native
  
  /**
    * Does this action manager has pick triggers
    */
  def hasPickTriggers: Boolean = js.native
  
  /**
    * Does this action manager has pointer triggers
    */
  def hasPointerTriggers: Boolean = js.native
  
  /**
    * Does this action manager handles actions of a given trigger
    * @param trigger defines the trigger to be tested
    * @param parameterPredicate defines an optional predicate to filter triggers by parameter
    * @returns whether the trigger is handled
    */
  def hasSpecificTrigger(trigger: Double): Boolean = js.native
  def hasSpecificTrigger(trigger: Double, parameterPredicate: js.Function1[/* parameter */ Any, Boolean]): Boolean = js.native
  
  /**
    * Does this action manager handles actions of any of the given triggers
    * @param triggers defines the triggers to be tested
    * @returns a boolean indicating whether one (or more) of the triggers is handled
    */
  def hasSpecificTriggers(triggers: js.Array[Double]): Boolean = js.native
  
  /**
    * Does this action manager handles actions of any of the given triggers. This function takes two arguments for
    * speed.
    * @param triggerA defines the trigger to be tested
    * @param triggerB defines the trigger to be tested
    * @returns a boolean indicating whether one (or more) of the triggers is handled
    */
  def hasSpecificTriggers2(triggerA: Double, triggerB: Double): Boolean = js.native
  
  /** Gets the cursor to use when hovering items */
  var hoverCursor: String = js.native
  
  /**
    * Gets or sets a boolean indicating that the manager is recursive meaning that it can trigger action from children
    */
  var isRecursive: Boolean = js.native
  
  /**
    * Process a specific trigger
    * @param trigger defines the trigger to process
    * @param evt defines the event details to be processed
    */
  def processTrigger(trigger: Double): Unit = js.native
  def processTrigger(trigger: Double, evt: IActionEvent): Unit = js.native
  
  /**
    * Registers an action to this action manager
    * @param action defines the action to be registered
    * @returns the action amended (prepared) after registration
    */
  def registerAction(action: IAction): Nullable[IAction] = js.native
  
  /**
    * Serialize this manager to a JSON object
    * @param name defines the property name to store this manager
    * @returns a JSON representation of this manager
    */
  def serialize(name: String): Any = js.native
  
  /**
    * Unregisters an action to this action manager
    * @param action defines the action to be unregistered
    * @returns a boolean indicating whether the action has been unregistered
    */
  def unregisterAction(action: IAction): Boolean = js.native
}
