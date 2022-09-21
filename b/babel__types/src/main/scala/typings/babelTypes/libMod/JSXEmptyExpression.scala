package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXEmptyExpression
  extends StObject
     with BaseNode
     with JSX
     with Node {
  
  @JSName("type")
  var type_JSXEmptyExpression: typings.babelTypes.babelTypesStrings.JSXEmptyExpression
}
object JSXEmptyExpression {
  
  inline def apply(): JSXEmptyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression]
  }
  
  extension [Self <: JSXEmptyExpression](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
