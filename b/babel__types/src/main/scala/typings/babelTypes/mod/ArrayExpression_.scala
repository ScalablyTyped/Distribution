package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ArrayExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  var elements: js.Array[Null | Expression | SpreadElement_]
  
  @JSName("type")
  var type_ArrayExpression_ : ArrayExpression
}
object ArrayExpression_ {
  
  inline def apply(elements: js.Array[Null | Expression | SpreadElement_]): ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression_]
  }
  
  extension [Self <: ArrayExpression_](x: Self) {
    
    inline def setElements(value: js.Array[Null | Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Null | Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
