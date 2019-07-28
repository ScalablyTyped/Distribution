package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`++`
import typings.babelDashTypes.babelDashTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpression
  extends Node
     with Expression {
  var argument: Expression
  var operator: `++` | `--`
  var prefix: Boolean
  @JSName("type")
  var type_UpdateExpression: typings.babelDashTypes.babelDashTypesStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `++` | `--`,
    prefix: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.UpdateExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, operator = operator.asInstanceOf[js.Any], prefix = prefix, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UpdateExpression]
  }
}

