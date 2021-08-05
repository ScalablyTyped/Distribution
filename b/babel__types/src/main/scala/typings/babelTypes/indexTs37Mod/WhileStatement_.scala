package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait WhileStatement_
  extends StObject
     with BaseNode
     with BlockParent
     with Loop
     with Scopable
     with Statement
     with While {
  
  var body: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_WhileStatement_ : WhileStatement
}
object WhileStatement_ {
  
  inline def apply(body: Statement, test: Expression): WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[WhileStatement_]
  }
  
  extension [Self <: WhileStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
