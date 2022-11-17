package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewExpression_
  extends StObject
     with BaseNode {
  
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  
  var callee: Expression | Super_ | V8IntrinsicIdentifier_
  
  var optional: true | false | Null
  
  var typeArguments: TypeParameterInstantiation_ | Null
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_NewExpression_ : "NewExpression"
}
object NewExpression_ {
  
  inline def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[NewExpression_]
  }
  
  extension [Self <: NewExpression_](x: Self) {
    
    inline def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_)*): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: Expression | Super_ | V8IntrinsicIdentifier_): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: true | false): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setType(value: "NewExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    inline def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
