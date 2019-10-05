package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExpressionWithTypeArguments
  extends Node
     with TSType {
  var expression: TSEntityName
  var typeParameters: TypeParameterInstantiation | Null
  @JSName("type")
  var type_TSExpressionWithTypeArguments: typings.babelDashTypes.babelDashTypesStrings.TSExpressionWithTypeArguments
}

@JSImport("babel-types", "TSExpressionWithTypeArguments")
@js.native
object TSExpressionWithTypeArguments extends js.Object {
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSEntityName, typeParameters: TypeParameterInstantiation): TSExpressionWithTypeArguments = js.native
}

