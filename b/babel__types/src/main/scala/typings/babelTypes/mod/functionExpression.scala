package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "functionExpression")
@js.native
object functionExpression extends js.Object {
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_
  ): FunctionExpression_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    generator: Boolean
  ): FunctionExpression_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    generator: Boolean,
    async: Boolean
  ): FunctionExpression_ = js.native
}

