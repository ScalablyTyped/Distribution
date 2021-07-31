package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSAsExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var expression: Expression
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSAsExpression_ : TSAsExpression
}
object TSAsExpression_ {
  
  @scala.inline
  def apply(expression: Expression, typeAnnotation: TSType): TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[TSAsExpression_]
  }
  
  @scala.inline
  implicit class TSAsExpression_MutableBuilder[Self <: TSAsExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
