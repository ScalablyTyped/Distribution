package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSInterfaceDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSInterfaceBody
  var declare: Boolean | Null
  var `extends`: js.Array[TSExpressionWithTypeArguments] | Null
  var id: Identifier_
  var typeParameters: TypeParameterDeclaration_ | Null
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
}

@JSImport("babel-types", "TSInterfaceDeclaration")
@js.native
object TSInterfaceDeclaration extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(id: Identifier_, typeParameters: Null, extends_ : js.UndefOr[scala.Nothing], body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier_,
    typeParameters: Null,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier_, typeParameters: Null, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
}

