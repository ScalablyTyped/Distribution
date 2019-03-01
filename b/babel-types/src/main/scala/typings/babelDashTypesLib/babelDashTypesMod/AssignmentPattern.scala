package typings
package babelDashTypesLib.babelDashTypesMod

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
  var type_AssignmentPattern: babelDashTypesLib.babelDashTypesLibStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    end: scala.Double,
    left: Identifier,
    loc: SourceLocation,
    right: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.AssignmentPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentPattern]
  }
}

