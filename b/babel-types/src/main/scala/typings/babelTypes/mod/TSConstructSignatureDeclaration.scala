package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConstructSignatureDeclaration
  extends Node
     with TSTypeElement {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSConstructSignatureDeclaration: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
}

@JSImport("babel-types", "TSConstructSignatureDeclaration")
@js.native
object TSConstructSignatureDeclaration extends js.Object {
  def apply(): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSTypeElement = js.native
  def apply(typeParameters: TypeParameterDeclaration_, parameters: js.Array[Identifier_ | RestElement_]): TSTypeElement = js.native
  def apply(
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
}

