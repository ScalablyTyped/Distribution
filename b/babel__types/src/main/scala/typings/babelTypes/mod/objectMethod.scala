package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "objectMethod")
@js.native
object objectMethod extends js.Object {
  
  def apply(
    kind: js.UndefOr[method | get | set],
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: js.UndefOr[Boolean],
    generator: js.UndefOr[Boolean],
    async: js.UndefOr[Boolean]
  ): ObjectMethod_ = js.native
}
