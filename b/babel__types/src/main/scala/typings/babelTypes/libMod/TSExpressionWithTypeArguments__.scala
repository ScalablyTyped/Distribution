package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExpressionWithTypeArguments__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var expression: TSEntityName
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSExpressionWithTypeArguments__ : TSExpressionWithTypeArguments
}
object TSExpressionWithTypeArguments__ {
  
  inline def apply(expression: TSEntityName): TSExpressionWithTypeArguments__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[TSExpressionWithTypeArguments__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSExpressionWithTypeArguments__] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: TSEntityName): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
