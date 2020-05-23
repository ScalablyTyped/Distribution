package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsCallSignatureDeclaration")
@js.native
object tsCallSignatureDeclaration extends js.Object {
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSCallSignatureDeclaration_ = js.native
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation_
  ): TSCallSignatureDeclaration_ = js.native
}

