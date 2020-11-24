package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types/lib/index-ts3.7", "classMethod")
@js.native
object classMethod extends js.Object {
  
  def apply(
    kind: js.UndefOr[get | set | method | constructor],
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    body: BlockStatement_,
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean],
    generator: js.UndefOr[Boolean],
    async: js.UndefOr[Boolean]
  ): ClassMethod_ = js.native
}
