package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadChild__
  extends StObject
     with BaseNode {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXSpreadChild__ : "JSXSpreadChild"
}
object JSXSpreadChild__ {
  
  inline def apply(expression: Expression): JSXSpreadChild__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild__]
  }
  
  extension [Self <: JSXSpreadChild__](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: "JSXSpreadChild"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
