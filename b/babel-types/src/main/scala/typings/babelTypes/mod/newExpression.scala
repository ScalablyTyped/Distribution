package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "newExpression")
@js.native
object newExpression extends js.Object {
  def apply(): NewExpression_ = js.native
  def apply(callee: js.UndefOr[scala.Nothing], _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
  def apply(callee: Expression): NewExpression_ = js.native
  def apply(callee: Expression, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
  def apply(callee: Super): NewExpression_ = js.native
  def apply(callee: Super, _arguments: js.Array[Expression | SpreadElement_]): NewExpression_ = js.native
}

