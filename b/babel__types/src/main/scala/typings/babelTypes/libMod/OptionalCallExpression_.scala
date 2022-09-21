package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.OptionalCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalCallExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_]
  
  var callee: Expression
  
  var optional: Boolean
  
  var typeArguments: js.UndefOr[TypeParameterInstantiation_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation | Null] = js.undefined
  
  @JSName("type")
  var type_OptionalCallExpression_ : OptionalCallExpression
}
object OptionalCallExpression_ {
  
  inline def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[OptionalCallExpression_]
  }
  
  extension [Self <: OptionalCallExpression_](x: Self) {
    
    inline def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_)*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: OptionalCallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
