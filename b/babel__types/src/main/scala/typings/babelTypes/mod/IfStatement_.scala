package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait IfStatement_
  extends StObject
     with BaseNode
     with Conditional
     with Statement {
  
  var alternate: Statement | Null
  
  var consequent: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_IfStatement_ : IfStatement
}
object IfStatement_ {
  
  inline def apply(consequent: Statement, test: Expression): IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[IfStatement_]
  }
  
  extension [Self <: IfStatement_](x: Self) {
    
    inline def setAlternate(value: Statement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    inline def setConsequent(value: Statement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
