package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TupleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TupleExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var elements: js.Array[Expression | SpreadElement_]
  
  @JSName("type")
  var type_TupleExpression_ : TupleExpression
}
object TupleExpression_ {
  
  @scala.inline
  def apply(elements: js.Array[Expression | SpreadElement_]): TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[TupleExpression_]
  }
  
  @scala.inline
  implicit class TupleExpression_MutableBuilder[Self <: TupleExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
