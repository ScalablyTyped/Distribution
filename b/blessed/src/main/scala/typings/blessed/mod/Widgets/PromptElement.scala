package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A prompt box containing a text input, okay, and cancel buttons (automatically hidden).
  */
@JSImport("blessed", "Widgets.PromptElement")
@js.native
class PromptElement protected () extends BoxElement {
  def this(opts: PromptOptions) = this()
  @JSName("options")
  var options_PromptElement: PromptOptions = js.native
  /**
    * Show the prompt and wait for the result of the textbox. Set text and initial value.
    */
  def input(text: String, value: String, callback: js.Function2[/* err */ js.Any, /* value */ String, Unit]): Unit = js.native
  def readInput(text: String, value: String, callback: js.Function2[/* err */ js.Any, /* value */ String, Unit]): Unit = js.native
  def setInput(text: String, value: String, callback: js.Function2[/* err */ js.Any, /* value */ String, Unit]): Unit = js.native
}

