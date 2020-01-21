package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExpressionWithTypeArguments
  extends Node
     with TSType {
  var expression: TSEntityName
  var typeParameters: TypeParameterInstantiation_ | Null
  @JSName("type")
  var type_TSExpressionWithTypeArguments: typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
}

@JSImport("babel-types", "TSExpressionWithTypeArguments")
@js.native
object TSExpressionWithTypeArguments extends js.Object {
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): TSExpressionWithTypeArguments = js.native
}

