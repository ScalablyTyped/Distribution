package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait AssignmentExpression
  extends Expression
     with BaseNode {
  var left: LVal
  var operator: String
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: typings.atBabelTypes.atBabelTypesStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    left: LVal,
    operator: String,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.AssignmentExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression]
  }
}

@JSImport("@babel/types", "assignmentExpression")
@js.native
object assignmentExpression extends js.Object {
  def apply(operator: String, left: LVal, right: Expression): AssignmentExpression = js.native
}

