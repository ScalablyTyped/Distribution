package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoExpression_
  extends StObject
     with Node
     with Expression {
  
  var body: BlockStatement_
  
  @JSName("type")
  var type_DoExpression_ : DoExpression
}
object DoExpression_ {
  
  inline def apply(body: BlockStatement_, end: Double, loc: SourceLocation, start: Double): DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[DoExpression_]
  }
  
  extension [Self <: DoExpression_](x: Self) {
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
