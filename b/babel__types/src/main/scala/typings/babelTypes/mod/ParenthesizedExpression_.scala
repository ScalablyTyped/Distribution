package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ParenthesizedExpression_
  extends Expression
     with BaseNode
     with ExpressionWrapper {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_ParenthesizedExpression_ : ParenthesizedExpression = js.native
}
object ParenthesizedExpression_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: ParenthesizedExpression): ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesizedExpression_]
  }
  
  @scala.inline
  implicit class ParenthesizedExpression_MutableBuilder[Self <: ParenthesizedExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ParenthesizedExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
