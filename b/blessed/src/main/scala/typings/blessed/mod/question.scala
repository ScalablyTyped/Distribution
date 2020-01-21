package typings.blessed.mod

import typings.blessed.mod.Widgets.QuestionElement
import typings.blessed.mod.Widgets.QuestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "question")
@js.native
object question extends js.Object {
  def apply(): QuestionElement = js.native
  def apply(options: QuestionOptions): QuestionElement = js.native
}

