package typings.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question box containing okay and cancel buttons (automatically hidden).
  */
@JSImport("blessed", "Widgets.QuestionElement")
@js.native
class QuestionElement protected () extends BoxElement {
  def this(opts: QuestionOptions) = this()
  
  /**
    * Ask a question. callback will yield the result.
    */
  def ask(question: String, callback: js.Function2[/* err */ js.Any, /* value */ String, Unit]): Unit = js.native
  
  @JSName("options")
  var options_QuestionElement: QuestionOptions = js.native
}
