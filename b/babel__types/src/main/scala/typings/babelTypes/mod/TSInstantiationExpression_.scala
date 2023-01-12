package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSInstantiationExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSInstantiationExpression_
  extends StObject
     with BaseNode
     with Expression
     with TypeScript {
  
  var expression: Expression
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSInstantiationExpression_ : TSInstantiationExpression
}
object TSInstantiationExpression_ {
  
  inline def apply(expression: Expression): TSInstantiationExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[TSInstantiationExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSInstantiationExpression_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSInstantiationExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
