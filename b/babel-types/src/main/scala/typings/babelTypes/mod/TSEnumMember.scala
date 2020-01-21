package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumMember extends Node {
  var id: Identifier_ | StringLiteral_
  var initializer: Expression | Null
  @JSName("type")
  var type_TSEnumMember: typings.babelTypes.babelTypesStrings.TSEnumMember
}

@JSImport("babel-types", "TSEnumMember")
@js.native
object TSEnumMember extends js.Object {
  def apply(id: Identifier_): TSEnumMember = js.native
  def apply(id: Identifier_, initializer: Expression): TSEnumMember = js.native
  def apply(id: StringLiteral_): TSEnumMember = js.native
  def apply(id: StringLiteral_, initializer: Expression): TSEnumMember = js.native
}

