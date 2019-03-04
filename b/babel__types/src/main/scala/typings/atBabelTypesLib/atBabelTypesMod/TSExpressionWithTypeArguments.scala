package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSExpressionWithTypeArguments
  extends TSType
     with BaseNode {
  var expression: TSEntityName
  var typeParameters: TSTypeParameterInstantiation | scala.Null
  @JSName("type")
  var type_TSExpressionWithTypeArguments: atBabelTypesLib.atBabelTypesLibStrings.TSExpressionWithTypeArguments
}

object TSExpressionWithTypeArguments {
  @scala.inline
  def apply(
    expression: TSEntityName,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSExpressionWithTypeArguments,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSExpressionWithTypeArguments]
  }
}

