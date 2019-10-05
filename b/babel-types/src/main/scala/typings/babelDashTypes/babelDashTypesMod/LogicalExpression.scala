package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`&&`
import typings.babelDashTypes.babelDashTypesStrings.`||`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: `||` | `&&`
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: typings.babelDashTypes.babelDashTypesStrings.LogicalExpression
}

object LogicalExpression {
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: `||` | `&&`,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.LogicalExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): LogicalExpression = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, operator = operator.asInstanceOf[js.Any], right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LogicalExpression]
  }
}

@JSImport("babel-types", "logicalExpression")
@js.native
object logicalExpression extends js.Object {
  def apply(): LogicalExpression = js.native
  def apply(operator: `&&`): LogicalExpression = js.native
  def apply(operator: `&&`, left: Expression): LogicalExpression = js.native
  def apply(operator: `&&`, left: Expression, right: Expression): LogicalExpression = js.native
  def apply(operator: `||`): LogicalExpression = js.native
  def apply(operator: `||`, left: Expression): LogicalExpression = js.native
  def apply(operator: `||`, left: Expression, right: Expression): LogicalExpression = js.native
}

