package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Command")
@js.native
open class Command () extends StObject {
  
  /**
    * Gets an event which is raised after the command executes, the event
    * is raised with the return value of the command as its only parameter.
    */
  var afterExecute: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets an event which is raised before the command executes, the event
    * is raised with an object containing two properties: a <code>cancel</code> property,
    * which if set to false by the listener will prevent the command from being executed, and
    * an <code>args</code> property, which is the array of arguments being passed to the command.
    */
  var beforeExecute: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets whether this command can currently be executed.  This property is observable.
    */
  var canExecute: Boolean = js.native
}
