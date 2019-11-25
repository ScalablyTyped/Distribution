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
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression]
  }
}

@JSImport("@babel/types", "logicalExpression")
@js.native
object logicalExpression extends js.Object {
  def apply(operator: `&&`, left: Expression, right: Expression): LogicalExpression = js.native
  def apply(operator: `??`, left: Expression, right: Expression): LogicalExpression = js.native
  def apply(operator: `||`, left: Expression, right: Expression): LogicalExpression = js.native
}

