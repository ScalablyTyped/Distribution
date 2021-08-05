package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExpression_
  extends StObject
     with Node
     with Expression {
  
  var elements: js.Array[Null | Expression | SpreadElement_]
  
  @JSName("type")
  var type_ArrayExpression_ : ArrayExpression
}
object ArrayExpression_ {
  
  inline def apply(
    elements: js.Array[Null | Expression | SpreadElement_],
    end: Double,
    loc: SourceLocation,
    start: Double
  ): ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[ArrayExpression_]
  }
  
  extension [Self <: ArrayExpression_](x: Self) {
    
    inline def setElements(value: js.Array[Null | Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Null | Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    inline def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
