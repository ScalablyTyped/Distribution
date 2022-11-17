package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSModuleDeclaration__
  extends StObject
     with BaseNode {
  
  var body: TSModuleBlock__ | TSModuleDeclaration__
  
  var declare: js.UndefOr[Boolean | Null] = js.undefined
  
  var global: js.UndefOr[Boolean | Null] = js.undefined
  
  var id: Identifier_ | StringLiteral_
  
  @JSName("type")
  var type_TSModuleDeclaration__ : "TSModuleDeclaration"
}
object TSModuleDeclaration__ {
  
  inline def apply(body: TSModuleBlock__ | TSModuleDeclaration__, id: Identifier_ | StringLiteral_): TSModuleDeclaration__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[TSModuleDeclaration__]
  }
  
  extension [Self <: TSModuleDeclaration__](x: Self) {
    
    inline def setBody(value: TSModuleBlock__ | TSModuleDeclaration__): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalNull: Self = StObject.set(x, "global", null)
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSModuleDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
