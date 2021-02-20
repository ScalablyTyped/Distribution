package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExpressionWithTypeArguments
  extends Node
     with TSType {
  
  var expression: TSEntityName = js.native
  
  var typeParameters: TypeParameterInstantiation_ | Null = js.native
  
  @JSName("type")
  var type_TSExpressionWithTypeArguments: typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments = js.native
}
object TSExpressionWithTypeArguments {
  
  @JSImport("babel-types/ts3.6", "TSExpressionWithTypeArguments")
  @js.native
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  @JSImport("babel-types/ts3.6", "TSExpressionWithTypeArguments")
  @js.native
  def apply(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): TSExpressionWithTypeArguments = js.native
  
  @scala.inline
  implicit class TSExpressionWithTypeArgumentsMutableBuilder[Self <: TSExpressionWithTypeArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: TSEntityName): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
