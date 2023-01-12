package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSInstantiationExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInstantiationExpression__
  extends StObject
     with BaseNode
     with Expression
     with Node
     with TypeScript {
  
  var expression: Expression
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSInstantiationExpression__ : TSInstantiationExpression
}
object TSInstantiationExpression__ {
  
  inline def apply(expression: Expression): TSInstantiationExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[TSInstantiationExpression__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSInstantiationExpression__] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSInstantiationExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
