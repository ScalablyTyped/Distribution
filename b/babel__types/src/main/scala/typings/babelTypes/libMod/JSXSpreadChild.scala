package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadChild
  extends StObject
     with BaseNode
     with Immutable
     with JSX
     with Node
     with ReturnedChild {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXSpreadChild: typings.babelTypes.babelTypesStrings.JSXSpreadChild
}
object JSXSpreadChild {
  
  inline def apply(expression: Expression): JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild]
  }
  
  extension [Self <: JSXSpreadChild](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
