package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSExpressionWithTypeArguments_
  extends TSType
     with BaseNode {
  
  var expression: TSEntityName = js.native
  
  var typeParameters: TSTypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_TSExpressionWithTypeArguments_ : TSExpressionWithTypeArguments = js.native
}
object TSExpressionWithTypeArguments_ {
  
  @scala.inline
  def apply(expression: TSEntityName, `type`: TSExpressionWithTypeArguments): TSExpressionWithTypeArguments_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExpressionWithTypeArguments_]
  }
  
  @scala.inline
  implicit class TSExpressionWithTypeArguments_MutableBuilder[Self <: TSExpressionWithTypeArguments_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: TSEntityName): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
