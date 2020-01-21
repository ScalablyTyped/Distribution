package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSCallSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSCallSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
}

@JSImport("babel-types", "TSCallSignatureDeclaration")
@js.native
object TSCallSignatureDeclaration extends js.Object {
  def apply(): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSCallSignatureDeclaration = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
}

