package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "declareClass")
@js.native
object declareClass extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration_],
    _extends: js.UndefOr[js.Array[InterfaceExtends_] | Null],
    body: ObjectTypeAnnotation_
  ): DeclareClass_ = js.native
}

