package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "declareInterface")
@js.native
object declareInterface extends js.Object {
  def apply(): DeclareInterface_ = js.native
  def apply(id: Identifier_): DeclareInterface_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareInterface_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareInterface_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    _extends: js.Array[InterfaceExtends_],
    body: ObjectTypeAnnotation_
  ): DeclareInterface_ = js.native
}

