package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "declareClass")
@js.native
object declareClass extends js.Object {
  def apply(): DeclareClass_ = js.native
  def apply(id: Identifier_): DeclareClass_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareClass_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, _extends: js.Array[InterfaceExtends_]): DeclareClass_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    _extends: js.Array[InterfaceExtends_],
    body: ObjectTypeAnnotation_
  ): DeclareClass_ = js.native
}

