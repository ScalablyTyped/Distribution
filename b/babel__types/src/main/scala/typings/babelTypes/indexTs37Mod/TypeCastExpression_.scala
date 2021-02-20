package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TypeCastExpression_
  extends Expression
     with BaseNode
     with ExpressionWrapper
     with Flow {
  
  var expression: Expression = js.native
  
  var typeAnnotation: TypeAnnotation_ = js.native
  
  @JSName("type")
  var type_TypeCastExpression_ : TypeCastExpression = js.native
}
object TypeCastExpression_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeCastExpression_]
  }
  
  @scala.inline
  implicit class TypeCastExpression_MutableBuilder[Self <: TypeCastExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeCastExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
