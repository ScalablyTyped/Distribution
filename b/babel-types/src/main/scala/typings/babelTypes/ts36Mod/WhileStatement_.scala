package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhileStatement_
  extends StObject
     with Node
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
  
  inline def apply(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[WhileStatement_]
  }
  
  extension [Self <: WhileStatement_](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
