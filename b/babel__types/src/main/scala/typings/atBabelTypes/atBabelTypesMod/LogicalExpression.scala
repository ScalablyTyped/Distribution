package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`&&`
import typings.atBabelTypes.atBabelTypesStrings.`??`
import typings.atBabelTypes.atBabelTypesStrings.`||`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait LogicalExpression
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression
  var operator: `||` | `&&` | `??`
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: typings.atBabelTypes.atBabelTypesStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: `||` | `&&` | `??`,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.LogicalExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LogicalExpression]
  }
}

