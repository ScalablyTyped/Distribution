package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsFunctionType")
@js.native
object tsFunctionType extends js.Object {
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSFunctionType_ = js.native
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation_
  ): TSFunctionType_ = js.native
}

