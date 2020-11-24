package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSConstructorType
  extends Node
     with TSType {
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSConstructorType: typings.babelTypes.babelTypesStrings.TSConstructorType = js.native
}
@JSImport("babel-types/ts3.6", "TSConstructorType")
@js.native
object TSConstructorType extends js.Object {
  
  def apply(): TSConstructorType = js.native
  def apply(typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration_): TSConstructorType = js.native
  def apply(typeParameters: TypeParameterDeclaration_, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
}
