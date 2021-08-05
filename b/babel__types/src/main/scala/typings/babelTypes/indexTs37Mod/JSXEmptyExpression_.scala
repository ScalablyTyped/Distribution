package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait JSXEmptyExpression_
  extends StObject
     with BaseNode
     with JSX {
  
  @JSName("type")
  var type_JSXEmptyExpression_ : JSXEmptyExpression
}
object JSXEmptyExpression_ {
  
  inline def apply(): JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[JSXEmptyExpression_]
  }
  
  extension [Self <: JSXEmptyExpression_](x: Self) {
    
    inline def setType(value: JSXEmptyExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
