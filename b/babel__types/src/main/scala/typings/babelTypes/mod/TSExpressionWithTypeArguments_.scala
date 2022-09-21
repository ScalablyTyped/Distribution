package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSExpressionWithTypeArguments_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  var expression: TSEntityName
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSExpressionWithTypeArguments_ : TSExpressionWithTypeArguments
}
object TSExpressionWithTypeArguments_ {
  
  inline def apply(expression: TSEntityName): TSExpressionWithTypeArguments_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[TSExpressionWithTypeArguments_]
  }
  
  extension [Self <: TSExpressionWithTypeArguments_](x: Self) {
    
    inline def setExpression(value: TSEntityName): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
