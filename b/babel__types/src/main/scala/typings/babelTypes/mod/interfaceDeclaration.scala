package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "interfaceDeclaration")
@js.native
object interfaceDeclaration extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration_],
    _extends: js.UndefOr[js.Array[InterfaceExtends_] | Null],
    body: ObjectTypeAnnotation_
  ): InterfaceDeclaration_ = js.native
}

