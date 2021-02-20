package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.OptionalCallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait OptionalCallExpression_
  extends Expression
     with BaseNode {
  
  var arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_] = js.native
  
  var callee: Expression = js.native
  
  var optional: Boolean = js.native
  
  var typeArguments: TypeParameterInstantiation_ | Null = js.native
  
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_OptionalCallExpression_ : OptionalCallExpression = js.native
}
object OptionalCallExpression_ {
  
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_],
    callee: Expression,
    optional: Boolean,
    `type`: OptionalCallExpression
  ): OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalCallExpression_]
  }
  
  @scala.inline
  implicit class OptionalCallExpression_MutableBuilder[Self <: OptionalCallExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_ | JSXNamespacedName_]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (Expression | SpreadElement_ | JSXNamespacedName_)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OptionalCallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
