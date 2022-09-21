package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInstantiationExpression
  extends StObject
     with BaseNode
     with Expression
     with Node
     with TypeScript {
  
  var expression: Expression
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation | Null] = js.undefined
  
  @JSName("type")
  var type_TSInstantiationExpression: typings.babelTypes.babelTypesStrings.TSInstantiationExpression
}
object TSInstantiationExpression {
  
  inline def apply(expression: Expression): TSInstantiationExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[TSInstantiationExpression]
  }
  
  extension [Self <: TSInstantiationExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSInstantiationExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
