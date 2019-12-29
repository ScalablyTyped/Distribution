package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.PlussignPlussign
import typings.babelDashTypes.babelDashTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpression
  extends Node
     with Expression {
  var argument: Expression
  var operator: PlussignPlussign | `--`
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
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.UpdateExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression]
  }
}

@JSImport("babel-types", "updateExpression")
@js.native
object updateExpression extends js.Object {
  def apply(): UpdateExpression = js.native
  def apply(operator: PlussignPlussign): UpdateExpression = js.native
  def apply(operator: PlussignPlussign, argument: Expression): UpdateExpression = js.native
  def apply(operator: PlussignPlussign, argument: Expression, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`): UpdateExpression = js.native
  def apply(operator: `--`, argument: Expression): UpdateExpression = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression = js.native
}

