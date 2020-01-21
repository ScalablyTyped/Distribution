package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMethodSignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null
  var key: Expression
  var optional: Boolean | Null
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSMethodSignature: typings.babelTypes.babelTypesStrings.TSMethodSignature
}

@JSImport("babel-types", "TSMethodSignature")
@js.native
object TSMethodSignature extends js.Object {
  def apply(key: Expression): TSMethodSignature = js.native
  def apply(key: Expression, typeParameters: TypeParameterDeclaration_): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
}

