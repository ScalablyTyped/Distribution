package typings.babelTypes.ts36Mod

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
@JSImport("babel-types/ts3.6", "TSExpressionWithTypeArguments")
@js.native
object TSExpressionWithTypeArguments extends js.Object {
  
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): TSExpressionWithTypeArguments = js.native
}
