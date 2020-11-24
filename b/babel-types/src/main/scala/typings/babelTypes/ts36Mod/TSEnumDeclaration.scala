package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("babel-types/ts3.6", "TSEnumDeclaration")
@js.native
object TSEnumDeclaration extends js.Object {
  
  def apply(id: Identifier_, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
}
