package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: Boolean | Null = js.native
  var declare: Boolean | Null = js.native
  var id: Identifier_ = js.native
  var initializer: Expression | Null = js.native
  var members: js.Array[TSEnumMember] = js.native
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelTypes.babelTypesStrings.TSEnumDeclaration = js.native
}

@JSImport("babel-types", "TSEnumDeclaration")
@js.native
object TSEnumDeclaration extends js.Object {
  def apply(id: Identifier_, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
}

