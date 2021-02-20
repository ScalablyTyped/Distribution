package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
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
object TSModuleDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSModuleDeclaration")
  @js.native
  def apply(id: Identifier_, body: TSModuleBlock): TSModuleDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSModuleDeclaration")
  @js.native
  def apply(id: Identifier_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSModuleDeclaration")
  @js.native
  def apply(id: StringLiteral_, body: TSModuleBlock): TSModuleDeclaration = js.native
  @JSImport("babel-types/ts3.6", "TSModuleDeclaration")
  @js.native
  def apply(id: StringLiteral_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  
  @scala.inline
  implicit class TSModuleDeclarationMutableBuilder[Self <: TSModuleDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: TSModuleBlock | TSModuleDeclaration): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNull: Self = StObject.set(x, "global", null)
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
