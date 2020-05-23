package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "functionDeclaration")
@js.native
object functionDeclaration extends js.Object {
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_
  ): FunctionDeclaration_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    generator: Boolean
  ): FunctionDeclaration_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    generator: Boolean,
    async: Boolean
  ): FunctionDeclaration_ = js.native
}

