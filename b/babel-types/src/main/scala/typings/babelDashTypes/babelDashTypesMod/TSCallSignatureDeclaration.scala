package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSCallSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSCallSignatureDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSCallSignatureDeclaration
}

@JSImport("babel-types", "TSCallSignatureDeclaration")
@js.native
object TSCallSignatureDeclaration extends js.Object {
  def apply(): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration): TSCallSignatureDeclaration = js.native
  def apply(typeParameters: TypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def apply(
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
}

