package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "ifStatement")
@js.native
object ifStatement extends js.Object {
  def apply(): IfStatement_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: js.UndefOr[scala.Nothing], alternate: Statement): IfStatement_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: Statement): IfStatement_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: Statement, alternate: Statement): IfStatement_ = js.native
  def apply(test: Expression): IfStatement_ = js.native
  def apply(test: Expression, consequent: js.UndefOr[scala.Nothing], alternate: Statement): IfStatement_ = js.native
  def apply(test: Expression, consequent: Statement): IfStatement_ = js.native
  def apply(test: Expression, consequent: Statement, alternate: Statement): IfStatement_ = js.native
}

