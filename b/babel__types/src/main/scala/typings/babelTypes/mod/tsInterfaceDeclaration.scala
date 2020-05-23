package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "tsInterfaceDeclaration")
@js.native
object tsInterfaceDeclaration extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TSTypeParameterDeclaration_],
    _extends: js.UndefOr[js.Array[TSExpressionWithTypeArguments_] | Null],
    body: TSInterfaceBody_
  ): TSInterfaceDeclaration_ = js.native
}

