package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXEmptyExpression__
  extends StObject
     with BaseNode {
  
  @JSName("type")
  var type_JSXEmptyExpression__ : "JSXEmptyExpression"
}
object JSXEmptyExpression__ {
  
  inline def apply(): JSXEmptyExpression__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression__]
  }
  
  extension [Self <: JSXEmptyExpression__](x: Self) {
    
    inline def setType(value: "JSXEmptyExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
