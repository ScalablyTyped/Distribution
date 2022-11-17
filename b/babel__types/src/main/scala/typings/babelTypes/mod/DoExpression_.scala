package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoExpression_
  extends StObject
     with BaseNode {
  
  var async: Boolean
  
  var body: BlockStatement_
  
  @JSName("type")
  var type_DoExpression_ : "DoExpression"
}
object DoExpression_ {
  
  inline def apply(async: Boolean, body: BlockStatement_): DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[DoExpression_]
  }
  
  extension [Self <: DoExpression_](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: "DoExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
