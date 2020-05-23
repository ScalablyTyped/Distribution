package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsConstructorType")
@js.native
object tsConstructorType extends js.Object {
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSConstructorType_ = js.native
  def apply(
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation_
  ): TSConstructorType_ = js.native
}

