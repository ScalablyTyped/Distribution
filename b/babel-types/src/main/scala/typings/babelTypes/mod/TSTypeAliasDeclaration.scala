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
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration_],
    typeAnnotation: TSType
  ): TSTypeAliasDeclaration = js.native
}

