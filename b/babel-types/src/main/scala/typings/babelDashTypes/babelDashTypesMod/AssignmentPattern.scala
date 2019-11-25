package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern
  extends Node
     with LVal
     with Pattern {
  var left: Identifier
  var right: Expression
  @JSName("type")
  var type_AssignmentPattern: typings.babelDashTypes.babelDashTypesStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    end: Double,
    left: Identifier,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.AssignmentPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern]
  }
}

@JSImport("babel-types", "assignmentPattern")
@js.native
object assignmentPattern extends js.Object {
  def apply(): AssignmentPattern = js.native
  def apply(left: Identifier): AssignmentPattern = js.native
  def apply(left: Identifier, right: Expression): AssignmentPattern = js.native
}

