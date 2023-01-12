package typings.babelTypes.libMod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression_
  extends StObject
     with BaseNode
     with Expression
     with Node
     with Standardized {
  
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_]
  
  var callee: Expression | Super_ | V8IntrinsicIdentifier_
  
  var optional: js.UndefOr[`true` | `false` | Null] = js.undefined
  
  var typeArguments: js.UndefOr[TypeParameterInstantiation_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterInstantiation__ | Null] = js.undefined
  
  @JSName("type")
  var type_CallExpression_ : CallExpression
}
object CallExpression_ {
  
  inline def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[CallExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExpression_] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_)*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression | Super_ | V8IntrinsicIdentifier_): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true` | `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
