package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSModuleDeclaration
  extends Node
     with Declaration
     with Statement {
  
  var body: TSModuleBlock | TSModuleDeclaration = js.native
  
  var declare: Boolean | Null = js.native
  
  var global: Boolean | Null = js.native
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelTypes.babelTypesStrings.TSModuleDeclaration = js.native
}
@JSImport("babel-types/ts3.6", "TSModuleDeclaration")
@js.native
object TSModuleDeclaration extends js.Object {
  
  def apply(id: Identifier_, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: Identifier_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def apply(id: StringLiteral_, body: TSModuleBlock): TSModuleDeclaration = js.native
  def apply(id: StringLiteral_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
}
