package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSTypeAliasDeclaration
  extends Node
     with Declaration
     with Statement {
  
  var declare: Boolean | Null = js.native
  
  var id: Identifier_ = js.native
  
  var typeAnnotation: TSType = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSTypeAliasDeclaration")
@js.native
object TSTypeAliasDeclaration extends js.Object {
  
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
}
