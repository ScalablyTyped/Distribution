package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSExpressionWithTypeArguments
  extends TSType
     with BaseNode {
  var expression: TSEntityName
  var typeParameters: TSTypeParameterInstantiation | Null
  @JSName("type")
  var type_TSExpressionWithTypeArguments: typings.atBabelTypes.atBabelTypesStrings.TSExpressionWithTypeArguments
}

object TSExpressionWithTypeArguments {
  @scala.inline
  def apply(
    expression: TSEntityName,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSExpressionWithTypeArguments,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TSTypeParameterInstantiation = null
  ): TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExpressionWithTypeArguments]
  }
}

@JSImport("@babel/types", "tsExpressionWithTypeArguments")
@js.native
object tsExpressionWithTypeArguments extends js.Object {
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  def apply(expression: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSExpressionWithTypeArguments = js.native
}

