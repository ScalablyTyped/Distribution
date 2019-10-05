package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConstructorType
  extends Node
     with TSType {
  var parameters: (js.Array[Identifier | RestElement]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSConstructorType: typings.babelDashTypes.babelDashTypesStrings.TSConstructorType
}

@JSImport("babel-types", "TSConstructorType")
@js.native
object TSConstructorType extends js.Object {
  def apply(): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
}

