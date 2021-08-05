package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXSpreadChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXSpreadChild_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  var expression: Expression
  
  @JSName("type")
  var type_JSXSpreadChild_ : JSXSpreadChild
}
object JSXSpreadChild_ {
  
  inline def apply(expression: Expression): JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[JSXSpreadChild_]
  }
  
  extension [Self <: JSXSpreadChild_](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXSpreadChild): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
