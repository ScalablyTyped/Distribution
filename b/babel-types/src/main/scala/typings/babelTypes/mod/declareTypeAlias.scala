package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "declareTypeAlias")
@js.native
object declareTypeAlias extends js.Object {
  def apply(): DeclareTypeAlias_ = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    right: FlowTypeAnnotation
  ): DeclareTypeAlias_ = js.native
  def apply(id: js.UndefOr[scala.Nothing], typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
  def apply(
    id: js.UndefOr[scala.Nothing],
    typeParameters: TypeParameterDeclaration_,
    right: FlowTypeAnnotation
  ): DeclareTypeAlias_ = js.native
  def apply(id: Identifier_): DeclareTypeAlias_ = js.native
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_): DeclareTypeAlias_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, right: FlowTypeAnnotation): DeclareTypeAlias_ = js.native
}

