package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSEnumDeclaration
  extends Node
     with Declaration
     with Statement {
  var const: Boolean | Null
  var declare: Boolean | Null
  var id: Identifier
  var initializer: Expression | Null
  var members: js.Array[TSEnumMember]
  @JSName("type")
  var type_TSEnumDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSEnumDeclaration
}

@JSImport("babel-types", "TSEnumDeclaration")
@js.native
object TSEnumDeclaration extends js.Object {
  def apply(id: Identifier, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
}

