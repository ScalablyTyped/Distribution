package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A box containing a message to be displayed (automatically hidden).
  */
@JSImport("blessed", "Widgets.MessageElement")
@js.native
open class MessageElement protected () extends BoxElement {
  def this(opts: MessageOptions) = this()
  
  def display(text: String, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  def display(text: String, time: Double, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  def error(text: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Display an error in the same way.
    */
  def error(text: String, time: Double, callback: js.Function0[Unit]): Unit = js.native
  
  def log(text: String, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  /**
    * Display a message for a time (default is 3 seconds). Set time to 0 for a
    * perpetual message that is dismissed on keypress.
    */
  def log(text: String, time: Double, callback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  @JSName("options")
  var options_MessageElement: MessageOptions = js.native
}
