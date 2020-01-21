package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: Boolean | Null
  var declare: Boolean | Null
  var id: Identifier_
  var initializer: Expression | Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelTypes.babelTypesStrings.TSEnumDeclaration
}

@JSImport("babel-types", "TSEnumDeclaration")
@js.native
object TSEnumDeclaration extends js.Object {
  def apply(id: Identifier_, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
}

