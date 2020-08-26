package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "whileStatement")
@js.native
object whileStatement extends js.Object {
  def apply(): WhileStatement_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], body: BlockStatement_): WhileStatement_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], body: Statement): WhileStatement_ = js.native
  def apply(test: Expression): WhileStatement_ = js.native
  def apply(test: Expression, body: BlockStatement_): WhileStatement_ = js.native
  def apply(test: Expression, body: Statement): WhileStatement_ = js.native
}

