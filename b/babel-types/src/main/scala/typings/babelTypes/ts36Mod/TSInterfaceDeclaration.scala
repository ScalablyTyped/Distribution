package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInterfaceDeclaration
  extends Node
     with Declaration
     with Statement {
  
  var body: TSInterfaceBody = js.native
  
  var declare: Boolean | Null = js.native
  
  var `extends`: js.Array[TSExpressionWithTypeArguments] | Null = js.native
  
  var id: Identifier_ = js.native
  
  var typeParameters: TypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSInterfaceDeclaration: typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSInterfaceDeclaration")
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
