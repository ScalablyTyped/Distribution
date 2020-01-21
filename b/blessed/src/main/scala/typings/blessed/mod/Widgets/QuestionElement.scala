package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A question box containing okay and cancel buttons (automatically hidden).
  */
@JSImport("blessed", "Widgets.QuestionElement")
@js.native
class QuestionElement protected () extends BoxElement {
  def this(opts: QuestionOptions) = this()
  @JSName("options")
  var options_QuestionElement: QuestionOptions = js.native
  /**
    * Ask a question. callback will yield the result.
    */
  def ask(question: String, callback: js.Function2[/* err */ js.Any, /* value */ String, Unit]): Unit = js.native
}

