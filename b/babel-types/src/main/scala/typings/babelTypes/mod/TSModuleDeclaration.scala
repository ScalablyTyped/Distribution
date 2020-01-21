package typings.babelTypes.mod

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
  var id: Identifier_ | StringLiteral_
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelTypes.babelTypesStrings.TSModuleDeclaration
}

@JSImport("babel-types", "TSModuleDeclaration")
@js.native
object TSModuleDeclaration extends js.Object {
  def apply(id: Identifier_, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: Identifier_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def apply(id: StringLiteral_, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: StringLiteral_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
}

