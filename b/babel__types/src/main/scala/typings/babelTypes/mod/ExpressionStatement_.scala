package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExpressionStatement_
  extends StObject
     with BaseNode
     with ExpressionWrapper
     with Statement {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExpressionStatement_ : ExpressionStatement
}
object ExpressionStatement_ {
  
  @scala.inline
  def apply(expression: Expression): ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[ExpressionStatement_]
  }
  
  @scala.inline
  implicit class ExpressionStatement_MutableBuilder[Self <: ExpressionStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
