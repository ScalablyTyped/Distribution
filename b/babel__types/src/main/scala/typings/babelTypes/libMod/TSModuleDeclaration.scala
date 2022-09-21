package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleDeclaration
  extends StObject
     with BaseNode
     with Declaration
     with Node
     with Statement
     with TypeScript {
  
  var body: TSModuleBlock | TSModuleDeclaration
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var global: js.UndefOr[Boolean | Null] = js.undefined
  
  var id: Identifier_ | StringLiteral_
  
  @JSName("type")
  var type_TSModuleDeclaration: typings.babelTypes.babelTypesStrings.TSModuleDeclaration
}
object TSModuleDeclaration {
  
  inline def apply(body: TSModuleBlock | TSModuleDeclaration, id: Identifier_ | StringLiteral_): TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[TSModuleDeclaration]
  }
  
  extension [Self <: TSModuleDeclaration](x: Self) {
    
    inline def setBody(value: TSModuleBlock | TSModuleDeclaration): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalNull: Self = StObject.set(x, "global", null)
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
