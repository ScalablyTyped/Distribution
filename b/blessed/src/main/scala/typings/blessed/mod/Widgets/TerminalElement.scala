package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def screenshot(
    xi: js.UndefOr[scala.Nothing],
    xl: js.UndefOr[scala.Nothing],
    yi: js.UndefOr[scala.Nothing],
    yl: Double
  ): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: js.UndefOr[scala.Nothing], yi: Double): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: js.UndefOr[scala.Nothing], yi: Double, yl: Double): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: Double): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: Double, yi: js.UndefOr[scala.Nothing], yl: Double): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: Double, yi: Double): String = js.native
  def screenshot(xi: js.UndefOr[scala.Nothing], xl: Double, yi: Double, yl: Double): String = js.native
  def screenshot(xi: Double): String = js.native
  def screenshot(xi: Double, xl: js.UndefOr[scala.Nothing], yi: js.UndefOr[scala.Nothing], yl: Double): String = js.native
  def screenshot(xi: Double, xl: js.UndefOr[scala.Nothing], yi: Double): String = js.native
  def screenshot(xi: Double, xl: js.UndefOr[scala.Nothing], yi: Double, yl: Double): String = js.native
  def screenshot(xi: Double, xl: Double): String = js.native
  def screenshot(xi: Double, xl: Double, yi: js.UndefOr[scala.Nothing], yl: Double): String = js.native
  def screenshot(xi: Double, xl: Double, yi: Double): String = js.native
  
  /**
    * reference to the headless term.js terminal.
    */
  var term: js.Any = js.native
  
  /**
    * write data to the terminal.
    */
  def write(data: String): Unit = js.native
}
