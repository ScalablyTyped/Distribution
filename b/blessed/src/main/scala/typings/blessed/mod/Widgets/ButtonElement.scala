package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.press
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("blessed", "Widgets.ButtonElement")
@js.native
class ButtonElement protected () extends InputElement {
  def this(opts: ButtonOptions) = this()
  
  @JSName("on")
  def on_press(event: press, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_ButtonElement: ButtonOptions = js.native
  
  /**
    * Press button. Emits press.
    */
  def press(): Unit = js.native
}
