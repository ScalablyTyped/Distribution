package typings.cesium.mod

import typings.cesium.mod.EventHelper.RemoveCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EventHelper")
@js.native
open class EventHelper () extends StObject {
  
  /**
    * Adds a listener to an event, and records the registration to be cleaned up later.
    * @param event - The event to attach to.
    * @param listener - The function to be executed when the event is raised.
    * @param [scope] - An optional object scope to serve as the <code>this</code>
    *        pointer in which the listener function will execute.
    * @returns A function that will remove this event listener when invoked.
    */
  def add(
    event: Event[js.Function1[/* repeated */ Any, Unit]],
    listener: js.Function1[/* repeated */ Any, Any]
  ): RemoveCallback = js.native
  def add(
    event: Event[js.Function1[/* repeated */ Any, Unit]],
    listener: js.Function1[/* repeated */ Any, Any],
    scope: Any
  ): RemoveCallback = js.native
  
  /**
    * Unregisters all previously added listeners.
    */
  def removeAll(): Unit = js.native
}
object EventHelper {
  
  /**
    * A function that removes a listener.
    */
  type RemoveCallback = js.Function0[Unit]
}
