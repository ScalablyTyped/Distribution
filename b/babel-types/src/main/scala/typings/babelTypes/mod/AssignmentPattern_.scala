package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentPattern_
  extends Node
     with LVal
     with Pattern {
  var left: Identifier_
  var right: Expression
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern
}

object AssignmentPattern_ {
  @scala.inline
  def apply(
    end: Double,
    left: Identifier_,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: AssignmentPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern_]
  }
}

