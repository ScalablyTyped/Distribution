package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSMethodSignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null
  var key: Expression
  var optional: Boolean | Null
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSMethodSignature: typings.babelDashTypes.babelDashTypesStrings.TSMethodSignature
}

@JSImport("babel-types", "TSMethodSignature")
@js.native
object TSMethodSignature extends js.Object {
  def apply(key: Expression): TSMethodSignature = js.native
  def apply(key: Expression, typeParameters: TypeParameterDeclaration): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement]
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
}

