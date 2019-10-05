package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSFunctionType
  extends Node
     with TSType {
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSFunctionType: typings.babelDashTypes.babelDashTypesStrings.TSFunctionType
}

@JSImport("babel-types", "TSFunctionType")
@js.native
object TSFunctionType extends js.Object {
  def apply(): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration): TSFunctionType = js.native
  def apply(typeParameters: TypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
}

