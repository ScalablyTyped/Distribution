package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesBooleans.`false`
import typings.babelTypes.babelTypesBooleans.`true`
import typings.babelTypes.babelTypesStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait CallExpression_
  extends Expression
     with BaseNode {
  
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_] = js.native
  
  var callee: Expression | V8IntrinsicIdentifier_ = js.native
  
  var optional: `true` | `false` | Null = js.native
  
  var typeArguments: TypeParameterInstantiation_ | Null = js.native
  
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_CallExpression_ : CallExpression = js.native
}
object CallExpression_ {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_,
    `type`: CallExpression
  ): CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallExpression_]
  }
  
  @scala.inline
  implicit class CallExpression_MutableBuilder[Self <: CallExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: Expression | V8IntrinsicIdentifier_): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: `true` | `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArguments(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
