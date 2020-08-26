package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSMethodSignature
  extends Node
     with TSTypeElement {
  var computed: Boolean | Null = js.native
  var key: Expression = js.native
  var optional: Boolean | Null = js.native
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  @JSName("type")
  var type_TSMethodSignature: typings.babelTypes.babelTypesStrings.TSMethodSignature = js.native
}

@JSImport("babel-types", "TSMethodSignature")
@js.native
object TSMethodSignature extends js.Object {
  def apply(key: Expression): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def apply(key: Expression, typeParameters: TypeParameterDeclaration_): TSMethodSignature = js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
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

