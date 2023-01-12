package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node {
  
  var async: Boolean
  
  var body: BlockStatement_
  
  @JSName("type")
  var type_DoExpression_ : DoExpression
}
object DoExpression_ {
  
  inline def apply(async: Boolean, body: BlockStatement_): DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[DoExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoExpression_] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
