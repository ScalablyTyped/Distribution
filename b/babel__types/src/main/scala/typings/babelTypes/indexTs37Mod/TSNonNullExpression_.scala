package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSNonNullExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var expression: Expression
  
  @JSName("type")
  var type_TSNonNullExpression_ : TSNonNullExpression
}
object TSNonNullExpression_ {
  
  @scala.inline
  def apply(expression: Expression): TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[TSNonNullExpression_]
  }
  
  @scala.inline
  implicit class TSNonNullExpression_MutableBuilder[Self <: TSNonNullExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
