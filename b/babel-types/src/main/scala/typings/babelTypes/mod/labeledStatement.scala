package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "labeledStatement")
@js.native
object labeledStatement extends js.Object {
  def apply(): LabeledStatement_ = js.native
  def apply(label: js.UndefOr[scala.Nothing], body: Statement): LabeledStatement_ = js.native
  def apply(label: Identifier_): LabeledStatement_ = js.native
  def apply(label: Identifier_, body: Statement): LabeledStatement_ = js.native
}

