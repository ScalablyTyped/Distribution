package typings.cypress.Cypress

import typings.cypress.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfig extends js.Object {
  /** The JQuery element for the command. This will highlight the command in the main window when debugging */
  @JSName("$el")
  var $el: JQuery[HTMLElement] = js.native
  /** Override *name* for display purposes only */
  var displayName: String = js.native
  var message: js.Array[_] = js.native
  /** Allows the name of the command to be overwritten */
  var name: String = js.native
  /** Return an object that will be printed in the dev tools console */
  def consoleProps(): ObjectLike = js.native
}

