package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConstructSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSConstructSignatureDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSConstructSignatureDeclaration
}

@JSImport("babel-types", "TSConstructSignatureDeclaration")
@js.native
object TSConstructSignatureDeclaration extends js.Object {
  def apply(): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSTypeElement = js.native
  def apply(
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
}

