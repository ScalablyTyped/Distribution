package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsDeclareFunction")
@js.native
object tsDeclareFunction extends js.Object {
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): TSDeclareFunction_ = js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    returnType: TSTypeAnnotation_ | Noop_
  ): TSDeclareFunction_ = js.native
}

