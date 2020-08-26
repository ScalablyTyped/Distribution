package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "conditionalExpression")
@js.native
object conditionalExpression extends js.Object {
  def apply(): ConditionalExpression_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: js.UndefOr[scala.Nothing], alternate: Expression): ConditionalExpression_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: Expression): ConditionalExpression_ = js.native
  def apply(test: js.UndefOr[scala.Nothing], consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
  def apply(test: Expression): ConditionalExpression_ = js.native
  def apply(test: Expression, consequent: js.UndefOr[scala.Nothing], alternate: Expression): ConditionalExpression_ = js.native
  def apply(test: Expression, consequent: Expression): ConditionalExpression_ = js.native
  def apply(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression_ = js.native
}

