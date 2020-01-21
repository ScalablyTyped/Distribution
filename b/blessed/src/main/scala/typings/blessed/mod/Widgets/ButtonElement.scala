package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.press
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.ButtonElement")
@js.native
class ButtonElement protected () extends InputElement {
  def this(opts: ButtonOptions) = this()
  /**
    * Original options object.
    */
  @JSName("options")
  var options_ButtonElement: ButtonOptions = js.native
  @JSName("on")
  def on_press(event: press, callback: js.Function0[Unit]): this.type = js.native
  /**
    * Press button. Emits press.
    */
  def press(): Unit = js.native
}

