package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  /** The JQuery element for the command. This will highlight the command in the main window when debugging */
  @JSName("$el")
  var $el: JQuery[HTMLElement]
  /** Override *name* for display purposes only */
  var displayName: String
  var message: js.Any
  /** Allows the name of the command to be overwritten */
  var name: String
  /** Return an object that will be printed in the dev tools console */
  def consoleProps(): ObjectLike
}

object LogConfig {
  @scala.inline
  def apply(
    $el: JQuery[HTMLElement],
    consoleProps: () => ObjectLike,
    displayName: String,
    message: js.Any,
    name: String
  ): LogConfig = {
    val __obj = js.Dynamic.literal($el = $el.asInstanceOf[js.Any], consoleProps = js.Any.fromFunction0(consoleProps), displayName = displayName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
}

