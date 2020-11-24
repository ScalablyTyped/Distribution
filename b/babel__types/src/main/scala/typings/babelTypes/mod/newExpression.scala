package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "newExpression")
@js.native
object newExpression extends js.Object {
  
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): NewExpression_ = js.native
  def apply(
    callee: V8IntrinsicIdentifier_,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): NewExpression_ = js.native
}
