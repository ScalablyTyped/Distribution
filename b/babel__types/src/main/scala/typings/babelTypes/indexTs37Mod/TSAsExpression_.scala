package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSAsExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSAsExpression_
  extends Expression
     with BaseNode {
  
  var expression: Expression = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSAsExpression_ : TSAsExpression = js.native
}
object TSAsExpression_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: TSAsExpression, typeAnnotation: TSType): TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
