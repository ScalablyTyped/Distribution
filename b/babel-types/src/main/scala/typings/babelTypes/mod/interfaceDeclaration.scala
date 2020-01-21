package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "interfaceDeclaration")
@js.native
object interfaceDeclaration extends js.Object {
  def apply(): InterfaceDeclaration_ = js.native
  def apply(id: Identifier_): InterfaceDeclaration_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_): InterfaceDeclaration_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): InterfaceDeclaration_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    _extends: js.Array[InterfaceExtends_],
    body: ObjectTypeAnnotation_
  ): InterfaceDeclaration_ = js.native
}

