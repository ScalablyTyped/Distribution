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

object TSExpressionWithTypeArguments {
  @scala.inline
  def apply(
    end: Double,
    expression: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSExpressionWithTypeArguments,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation = null
  ): TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(end = end, expression = expression, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSExpressionWithTypeArguments]
  }
}

