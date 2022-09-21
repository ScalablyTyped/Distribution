package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.TerminalElement")
@js.native
open class TerminalElement protected () extends BoxElement {
  def this(opts: TerminalOptions) = this()
  
  @JSName("options")
  var options_TerminalElement: TerminalOptions = js.native
  
  /**
    * reference to the pty.js pseudo terminal.
    */
  var pty: Any = js.native
  
  def screenshot(xi: Double): String = js.native
  def screenshot(xi: Double, xl: Double): String = js.native
  def screenshot(xi: Double, xl: Double, yi: Double): String = js.native
  def screenshot(xi: Double, xl: Double, yi: Unit, yl: Double): String = js.native
  def screenshot(xi: Double, xl: Unit, yi: Double): String = js.native
  def screenshot(xi: Double, xl: Unit, yi: Double, yl: Double): String = js.native
  def screenshot(xi: Double, xl: Unit, yi: Unit, yl: Double): String = js.native
  def screenshot(xi: Unit, xl: Double): String = js.native
  def screenshot(xi: Unit, xl: Double, yi: Double): String = js.native
  def screenshot(xi: Unit, xl: Double, yi: Double, yl: Double): String = js.native
  def screenshot(xi: Unit, xl: Double, yi: Unit, yl: Double): String = js.native
  def screenshot(xi: Unit, xl: Unit, yi: Double): String = js.native
  def screenshot(xi: Unit, xl: Unit, yi: Double, yl: Double): String = js.native
  def screenshot(xi: Unit, xl: Unit, yi: Unit, yl: Double): String = js.native
  
  /**
    * reference to the headless term.js terminal.
    */
  var term: Any = js.native
  
  /**
    * write data to the terminal.
    */
  def write(data: String): Unit = js.native
}
