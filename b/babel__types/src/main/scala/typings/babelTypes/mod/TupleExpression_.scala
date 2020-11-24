package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TupleExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
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
  implicit class TupleExpression_Ops[Self <: TupleExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: (Expression | SpreadElement_)*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Expression | SpreadElement_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TupleExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
