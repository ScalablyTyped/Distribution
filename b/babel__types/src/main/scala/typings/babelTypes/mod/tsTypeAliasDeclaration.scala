package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsTypeAliasDeclaration")
@js.native
object tsTypeAliasDeclaration extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    typeAnnotation: TSType
  ): TSTypeAliasDeclaration_ = js.native
}

