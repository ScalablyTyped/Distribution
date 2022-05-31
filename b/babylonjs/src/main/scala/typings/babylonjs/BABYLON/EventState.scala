package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventState extends StObject {
  
  /**
    * The current object in the bubbling phase
    */
  var currentTarget: js.UndefOr[js.Any] = js.native
  
  /**
    * Initialize the current event state
    * @param mask defines the mask associated with this state
    * @param skipNextObservers defines a flag which will instruct the observable to skip following observers when set to true
    * @param target defines the original target of the state
    * @param currentTarget defines the current target of the state
    * @returns the current event state
    */
  def initalize(mask: Double): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean, target: js.Any, currentTarget: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Boolean, target: Unit, currentTarget: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Unit, target: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Unit, target: js.Any, currentTarget: js.Any): EventState = js.native
  def initalize(mask: Double, skipNextObservers: Unit, target: Unit, currentTarget: js.Any): EventState = js.native
  
  /**
    * This will be populated with the return value of the last function that was executed.
    * If it is the first function in the callback chain it will be the event data.
    */
  var lastReturnValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the mask value that were used to trigger the event corresponding to this EventState object
    */
  var mask: Double = js.native
  
  /**
    * An Observer can set this property to true to prevent subsequent observers of being notified
    */
  var skipNextObservers: Boolean = js.native
  
  /**
    * The object that originally notified the event
    */
  var target: js.UndefOr[js.Any] = js.native
  
  /**
    * User defined information that will be sent to observers
    */
  var userInfo: js.UndefOr[js.Any] = js.native
}
