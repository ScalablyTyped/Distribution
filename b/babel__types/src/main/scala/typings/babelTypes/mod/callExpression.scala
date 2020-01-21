package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "callExpression")
@js.native
object callExpression extends js.Object {
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): CallExpression_ = js.native
  def apply(
    callee: V8IntrinsicIdentifier_,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): CallExpression_ = js.native
}

