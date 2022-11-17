package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleExpression_
  extends StObject
     with BaseNode {
  
  var elements: js.Array[Expression | SpreadElement_]
  
  @JSName("type")
  var type_TupleExpression_ : "TupleExpression"
}
object TupleExpression_ {
  
  inline def apply(elements: js.Array[Expression | SpreadElement_]): TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[TupleExpression_]
  }
  
  extension [Self <: TupleExpression_](x: Self) {
    
    inline def setElements(value: js.Array[Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: "TupleExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
