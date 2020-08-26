package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "opaqueType")
@js.native
object opaqueType extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType_ = js.native
  def apply(id: Identifier_, typeParameters: js.UndefOr[scala.Nothing], supertype: Null, impltype: FlowType): OpaqueType_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: FlowType,
    impltype: FlowType
  ): OpaqueType_ = js.native
  def apply(id: Identifier_, typeParameters: Null, supertype: js.UndefOr[scala.Nothing], impltype: FlowType): OpaqueType_ = js.native
  def apply(id: Identifier_, typeParameters: Null, supertype: Null, impltype: FlowType): OpaqueType_ = js.native
  def apply(id: Identifier_, typeParameters: Null, supertype: FlowType, impltype: FlowType): OpaqueType_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType_ = js.native
  def apply(id: Identifier_, typeParameters: TypeParameterDeclaration_, supertype: Null, impltype: FlowType): OpaqueType_ = js.native
  def apply(
    id: Identifier_,
    typeParameters: TypeParameterDeclaration_,
    supertype: FlowType,
    impltype: FlowType
  ): OpaqueType_ = js.native
}

