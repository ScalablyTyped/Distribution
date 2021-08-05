package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ReturnStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ReturnStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var argument: Expression | Null
  
  @JSName("type")
  var type_ReturnStatement_ : ReturnStatement
}
object ReturnStatement_ {
  
  inline def apply(): ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement_]
  }
  
  extension [Self <: ReturnStatement_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    inline def setType(value: ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
