package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ParenthesizedExpression
  extends Expression
     with BaseNode
     with ExpressionWrapper {
  var expression: Expression
  @JSName("type")
  var type_ParenthesizedExpression: typings.atBabelTypes.atBabelTypesStrings.ParenthesizedExpression
}

object ParenthesizedExpression {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ParenthesizedExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ParenthesizedExpression]
  }
}

@JSImport("@babel/types", "parenthesizedExpression")
@js.native
object parenthesizedExpression extends js.Object {
  def apply(expression: Expression): ParenthesizedExpression = js.native
}

