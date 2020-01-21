package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSFunctionType
  extends Node
     with TSType {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSFunctionType: typings.babelTypes.babelTypesStrings.TSFunctionType
}

@JSImport("babel-types", "TSFunctionType")
@js.native
object TSFunctionType extends js.Object {
  def apply(): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
}

