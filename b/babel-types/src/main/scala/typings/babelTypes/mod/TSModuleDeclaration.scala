package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleDeclaration
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var body: TSModuleBlock | TSModuleDeclaration
  
  var declare: Boolean | Null
  
  var global: Boolean | Null
  
  var id: Identifier_ | StringLiteral_
  
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelTypes.babelTypesStrings.TSModuleDeclaration
}
object TSModuleDeclaration {
  
  @JSImport("babel-types", "TSModuleDeclaration")
  @js.native
  def apply(id: Identifier_, body: TSModuleBlock): TSModuleDeclaration = js.native
  @JSImport("babel-types", "TSModuleDeclaration")
  @js.native
  def apply(id: Identifier_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  @JSImport("babel-types", "TSModuleDeclaration")
  @js.native
  def apply(id: StringLiteral_, body: TSModuleBlock): TSModuleDeclaration = js.native
  @JSImport("babel-types", "TSModuleDeclaration")
  @js.native
  def apply(id: StringLiteral_, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  
  extension [Self <: TSModuleDeclaration](x: Self) {
    
    inline def setBody(value: TSModuleBlock | TSModuleDeclaration): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalNull: Self = StObject.set(x, "global", null)
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
