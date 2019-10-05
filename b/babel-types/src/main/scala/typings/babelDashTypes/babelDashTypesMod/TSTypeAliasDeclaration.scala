package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAliasDeclaration
  extends Node
     with Declaration
     with Statement {
  var declare: Boolean | Null
  var id: Identifier
  var typeAnnotation: TSType
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSTypeAliasDeclaration
}

@JSImport("babel-types", "TSTypeAliasDeclaration")
@js.native
object TSTypeAliasDeclaration extends js.Object {
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
}

