package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait AssignmentExpression
  extends Expression
     with BaseNode {
  var left: LVal
  var operator: java.lang.String
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: atBabelTypesLib.atBabelTypesLibStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: LVal,
    operator: java.lang.String,
    right: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.AssignmentExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("right")(right)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentExpression]
  }
}

