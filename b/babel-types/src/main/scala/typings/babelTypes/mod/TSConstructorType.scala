package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSConstructorType
  extends Node
     with TSType {
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  var typeAnnotation: TSTypeAnnotation | Null
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSConstructorType: typings.babelTypes.babelTypesStrings.TSConstructorType
}

@JSImport("babel-types", "TSConstructorType")
@js.native
object TSConstructorType extends js.Object {
  def apply(): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
}

