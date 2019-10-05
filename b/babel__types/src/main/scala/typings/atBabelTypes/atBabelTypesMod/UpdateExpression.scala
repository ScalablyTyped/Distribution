package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`++`
import typings.atBabelTypes.atBabelTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait UpdateExpression
  extends Expression
     with BaseNode {
  var argument: Expression
  var operator: `++` | `--`
  var prefix: Boolean
  @JSName("type")
  var type_UpdateExpression: typings.atBabelTypes.atBabelTypesStrings.UpdateExpression
}

object UpdateExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: `++` | `--`,
    prefix: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.UpdateExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): UpdateExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator.asInstanceOf[js.Any], prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UpdateExpression]
  }
}

@JSImport("@babel/types", "updateExpression")
@js.native
object updateExpression extends js.Object {
  def apply(operator: `++`, argument: Expression): UpdateExpression = js.native
  def apply(operator: `++`, argument: Expression, prefix: Boolean): UpdateExpression = js.native
  def apply(operator: `--`, argument: Expression): UpdateExpression = js.native
  def apply(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression = js.native
}

