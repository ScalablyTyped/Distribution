package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TupleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TupleExpression_
  extends Expression
     with BaseNode {
  
  var elements: js.Array[Expression | SpreadElement_] = js.native
  
  @JSName("type")
  var type_TupleExpression_ : TupleExpression = js.native
}
object TupleExpression_ {
  
  @scala.inline
  def apply(elements: js.Array[Expression | SpreadElement_], `type`: TupleExpression): TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
