package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSFunctionType
  extends Node
     with TSType {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  @JSName("type")
  var type_TSFunctionType: typings.babelTypes.babelTypesStrings.TSFunctionType = js.native
}

@JSImport("babel-types", "TSFunctionType")
@js.native
object TSFunctionType extends js.Object {
  def apply(): TSFunctionType = js.native
  def apply(typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
}

