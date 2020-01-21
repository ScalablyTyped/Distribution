package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.`--`
import typings.babelTypes.babelTypesStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "unaryExpression")
@js.native
object unaryExpression extends js.Object {
  def apply(): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Tilde): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `--`): UnaryExpression_ = js.native
  def apply(operator: `--`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `-_`): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
}

