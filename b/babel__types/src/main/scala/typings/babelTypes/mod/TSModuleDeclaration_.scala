package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSModuleDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Statement
     with TypeScript {
  
  var body: TSModuleBlock_ | TSModuleDeclaration_
  
  var declare: Boolean | Null
  
  var global: Boolean | Null
  
  var id: Identifier_ | StringLiteral_
  
  @JSName("type")
  var type_TSModuleDeclaration_ : TSModuleDeclaration
}
object TSModuleDeclaration_ {
  
  inline def apply(body: TSModuleBlock_ | TSModuleDeclaration_, id: Identifier_ | StringLiteral_): TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, global = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[TSModuleDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSModuleDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setBody(value: TSModuleBlock_ | TSModuleDeclaration_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalNull: Self = StObject.set(x, "global", null)
    
    inline def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSModuleDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
