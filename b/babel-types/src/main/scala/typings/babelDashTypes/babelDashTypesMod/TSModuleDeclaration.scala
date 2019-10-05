package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSModuleDeclaration
  extends Node
     with Declaration
     with Statement {
  var body: TSModuleBlock | TSModuleDeclaration
  var declare: Boolean | Null
  var global: Boolean | Null
  var id: Identifier | StringLiteral
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelDashTypes.babelDashTypesStrings.TSModuleDeclaration
}

@JSImport("babel-types", "TSModuleDeclaration")
@js.native
object TSModuleDeclaration extends js.Object {
  def apply(id: Identifier, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: Identifier, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: StringLiteral, body: TSModuleDeclaration): TSModuleDeclaration = js.native
}

