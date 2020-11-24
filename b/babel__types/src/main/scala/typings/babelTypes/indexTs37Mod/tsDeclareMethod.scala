package typings.babelTypes.indexTs37Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types/lib/index-ts3.7", "tsDeclareMethod")
@js.native
object tsDeclareMethod extends js.Object {
  
  def apply(
    decorators: js.UndefOr[js.Array[Decorator_] | Null],
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    returnType: js.UndefOr[TSTypeAnnotation_ | Noop_ | Null]
  ): TSDeclareMethod_ = js.native
}
