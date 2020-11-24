package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "arrowFunctionExpression")
@js.native
object arrowFunctionExpression extends js.Object {
  
  def apply(
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_
  ): ArrowFunctionExpression_ = js.native
  def apply(
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    async: Boolean
  ): ArrowFunctionExpression_ = js.native
  def apply(params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_], body: Expression): ArrowFunctionExpression_ = js.native
  def apply(
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: Expression,
    async: Boolean
  ): ArrowFunctionExpression_ = js.native
}
