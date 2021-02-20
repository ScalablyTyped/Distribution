package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SequenceExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait SequenceExpression_
  extends Expression
     with BaseNode {
  
  var expressions: js.Array[Expression] = js.native
  
  @JSName("type")
  var type_SequenceExpression_ : SequenceExpression = js.native
}
object SequenceExpression_ {
  
  @scala.inline
  def apply(expressions: js.Array[Expression], `type`: SequenceExpression): SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression_]
  }
  
  @scala.inline
  implicit class SequenceExpression_MutableBuilder[Self <: SequenceExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: SequenceExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
