package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.TerminalElement")
@js.native
class TerminalElement protected () extends BoxElement {
  def this(opts: TerminalOptions) = this()
  @JSName("options")
  var options_TerminalElement: TerminalOptions = js.native
  /**
    * reference to the pty.js pseudo terminal.
    */
  var pty: js.Any = js.native
  /**
    * reference to the headless term.js terminal.
    */
  var term: js.Any = js.native
  def screenshot(xi: Double): String = js.native
  def screenshot(xi: Double, xl: Double): String = js.native
  def screenshot(xi: Double, xl: Double, yi: Double): String = js.native
  /**
    * write data to the terminal.
    */
  def write(data: String): Unit = js.native
}

