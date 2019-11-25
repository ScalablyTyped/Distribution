package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParenthesizedExpression
  extends Node
     with Expression
     with ExpressionWrapper {
  var expression: Expression
  @JSName("type")
  var type_ParenthesizedExpression: typings.babelDashTypes.babelDashTypesStrings.ParenthesizedExpression
}

object ParenthesizedExpression {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ParenthesizedExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ParenthesizedExpression = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesizedExpression]
  }
}

@JSImport("babel-types", "parenthesizedExpression")
@js.native
object parenthesizedExpression extends js.Object {
  def apply(): ParenthesizedExpression = js.native
  def apply(expression: Expression): ParenthesizedExpression = js.native
}

