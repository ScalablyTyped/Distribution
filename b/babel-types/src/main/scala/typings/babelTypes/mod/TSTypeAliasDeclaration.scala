package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeAliasDeclaration
  extends Node
     with Declaration
     with Statement {
  var declare: Boolean | Null
  var id: Identifier_
  var typeAnnotation: TSType
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSTypeAliasDeclaration: typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
}

@JSImport("babel-types", "TSTypeAliasDeclaration")
@js.native
object TSTypeAliasDeclaration extends js.Object {
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier_, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
}

