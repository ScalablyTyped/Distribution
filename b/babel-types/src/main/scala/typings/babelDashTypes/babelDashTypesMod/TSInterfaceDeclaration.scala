package typings.babelDashTypes.babelDashTypesMod

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
  var id: Identifier
  var typeParameters: TypeParameterDeclaration | Null
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSInterfaceDeclaration
}

@JSImport("babel-types", "TSInterfaceDeclaration")
@js.native
object TSInterfaceDeclaration extends js.Object {
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, extends_ : js.UndefOr[scala.Nothing], body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: Null,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: Null, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def apply(id: Identifier, typeParameters: TypeParameterDeclaration, extends_ : Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
}

