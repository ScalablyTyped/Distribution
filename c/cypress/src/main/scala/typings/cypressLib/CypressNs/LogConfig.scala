package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  /** The JQuery element for the command. This will highlight the command in the main window when debugging */
  @JSName("$el")
  var $el: jqueryLib.JQuery[stdLib.HTMLElement]
  /** Override *name* for display purposes only */
  var displayName: java.lang.String
  var message: js.Array[_]
  /** Allows the name of the command to be overwritten */
  var name: java.lang.String
  /** Return an object that will be printed in the dev tools console */
  def consoleProps(): ObjectLike
}

object LogConfig {
  @scala.inline
  def apply(
    $el: jqueryLib.JQuery[stdLib.HTMLElement],
    consoleProps: js.Function0[ObjectLike],
    displayName: java.lang.String,
    message: js.Array[_],
    name: java.lang.String
  ): LogConfig = {
    val __obj = js.Dynamic.literal($el = $el, consoleProps = consoleProps, displayName = displayName, message = message, name = name)
  
    __obj.asInstanceOf[LogConfig]
  }
}

