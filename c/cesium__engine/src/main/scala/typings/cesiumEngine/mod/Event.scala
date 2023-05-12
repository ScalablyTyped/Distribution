package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.Event.RemoveCallback
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Event")
@js.native
open class Event[Listener /* <: js.Function1[/* repeated */ Any, Unit] */] () extends StObject {
  
  /**
    * Registers a callback function to be executed whenever the event is raised.
    * An optional scope can be provided to serve as the <code>this</code> pointer
    * in which the function will execute.
    * @param listener - The function to be executed when the event is raised.
    * @param [scope] - An optional object scope to serve as the <code>this</code>
    *        pointer in which the listener function will execute.
    * @returns A function that will remove this event listener when invoked.
    */
  def addEventListener(listener: Listener): RemoveCallback = js.native
  def addEventListener(listener: Listener, scope: Any): RemoveCallback = js.native
  
  /**
    * The number of listeners currently subscribed to the event.
    */
  val numberOfListeners: Double = js.native
  
  /**
    * Raises the event by calling each registered listener with all supplied arguments.
    * @param arguments - This method takes any number of parameters and passes them through to the listener functions.
    */
  def raiseEvent(arguments: Parameters[Listener]*): Unit = js.native
  
  /**
    * Unregisters a previously registered callback.
    * @param listener - The function to be unregistered.
    * @param [scope] - The scope that was originally passed to addEventListener.
    * @returns <code>true</code> if the listener was removed; <code>false</code> if the listener and scope are not registered with the event.
    */
  def removeEventListener(listener: Listener): Boolean = js.native
  def removeEventListener(listener: Listener, scope: Any): Boolean = js.native
}
object Event {
  
  /**
    * A function that removes a listener.
    */
  type RemoveCallback = js.Function0[Unit]
}
