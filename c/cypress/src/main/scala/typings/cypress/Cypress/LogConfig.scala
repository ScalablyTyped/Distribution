package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.cypress.cypressStrings.child
import typings.cypress.cypressStrings.parent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfig
  extends StObject
     with Timeoutable {
  
  /** The JQuery element for the command. This will highlight the command in the main window when debugging */
  @JSName("$el")
  var $el: JQuery[HTMLElement]
  
  /** Set to false if you want to control the finishing of the command in the log yourself */
  var autoEnd: Boolean
  
  /** Return an object that will be printed in the dev tools console */
  def consoleProps(): ObjectLike
  
  /** Override *name* for display purposes only */
  var displayName: String
  
  /** Set to true to immediately finish the log  */
  var end: Boolean
  
  /** Unique id for the log, in the form of '<origin>-<number>' */
  var id: String
  
  /** additional information to include in the log */
  var message: Any
  
  /** Allows the name of the command to be overwritten */
  var name: String
  
  /** The scope of the log entry. If child, will appear nested below parents, prefixed with '-' */
  var `type`: parent | child
}
object LogConfig {
  
  inline def apply(
    $el: JQuery[HTMLElement],
    autoEnd: Boolean,
    consoleProps: () => ObjectLike,
    displayName: String,
    end: Boolean,
    id: String,
    message: Any,
    name: String,
    timeout: Double,
    `type`: parent | child
  ): LogConfig = {
    val __obj = js.Dynamic.literal($el = $el.asInstanceOf[js.Any], autoEnd = autoEnd.asInstanceOf[js.Any], consoleProps = js.Any.fromFunction0(consoleProps), displayName = displayName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  
  extension [Self <: LogConfig](x: Self) {
    
    inline def set$el(value: JQuery[HTMLElement]): Self = StObject.set(x, "$el", value.asInstanceOf[js.Any])
    
    inline def setAutoEnd(value: Boolean): Self = StObject.set(x, "autoEnd", value.asInstanceOf[js.Any])
    
    inline def setConsoleProps(value: () => ObjectLike): Self = StObject.set(x, "consoleProps", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: parent | child): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
