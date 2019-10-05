package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember extends Node {
  var id: Identifier | StringLiteral
  var initializer: Expression | Null
  @JSName("type")
  var type_TSEnumMember: typings.babelDashTypes.babelDashTypesStrings.TSEnumMember
}

@JSImport("babel-types", "TSEnumMember")
@js.native
object TSEnumMember extends js.Object {
  def apply(id: Identifier): TSEnumMember = js.native
  def apply(id: Identifier, initializer: Expression): TSEnumMember = js.native
  def apply(id: StringLiteral): TSEnumMember = js.native
  def apply(id: StringLiteral, initializer: Expression): TSEnumMember = js.native
}

