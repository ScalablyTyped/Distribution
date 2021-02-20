package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ArrayExpression_
  extends Expression
     with BaseNode {
  
  var elements: js.Array[Null | Expression | SpreadElement_] = js.native
  
  @JSName("type")
  var type_ArrayExpression_ : ArrayExpression = js.native
}
object ArrayExpression_ {
  
  @scala.inline
  def apply(elements: js.Array[Null | Expression | SpreadElement_], `type`: ArrayExpression): ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayExpression_]
  }
  
  @scala.inline
  implicit class ArrayExpression_MutableBuilder[Self <: ArrayExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Null | Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: (Null | Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
