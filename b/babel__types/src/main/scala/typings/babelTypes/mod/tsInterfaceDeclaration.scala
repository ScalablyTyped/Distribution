package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsInterfaceDeclaration")
@js.native
object tsInterfaceDeclaration extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[TSExpressionWithTypeArguments_],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], _extends: Null, body: TSInterfaceBody_): TSInterfaceDeclaration_ = js.native
  def apply(id: Identifier_, typeParameters: Null, _extends: js.UndefOr[scala.Nothing], body: TSInterfaceBody_): TSInterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: Null,
    _extends: js.Array[TSExpressionWithTypeArguments_],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
  def apply(id: Identifier_, typeParameters: Null, _extends: Null, body: TSInterfaceBody_): TSInterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TSTypeParameterDeclaration_,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TSTypeParameterDeclaration_,
    _extends: js.Array[TSExpressionWithTypeArguments_],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TSTypeParameterDeclaration_,
    _extends: Null,
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
}

