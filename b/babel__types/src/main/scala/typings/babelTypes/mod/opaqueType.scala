package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "opaqueType")
@js.native
object opaqueType extends js.Object {
  def apply(
    id: Identifier_,
    typeParameters: js.UndefOr[Null | TypeParameterDeclaration_],
    supertype: js.UndefOr[FlowType | Null],
    impltype: FlowType
  ): OpaqueType_ = js.native
}

