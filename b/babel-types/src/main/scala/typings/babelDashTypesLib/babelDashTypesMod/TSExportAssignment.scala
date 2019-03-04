package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSExportAssignment
  extends Node
     with Statement {
  var expression: Expression
  @JSName("type")
  var type_TSExportAssignment: babelDashTypesLib.babelDashTypesLibStrings.TSExportAssignment
}

object TSExportAssignment {
  @scala.inline
  def apply(
    end: scala.Double,
    expression: Expression,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSExportAssignment,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSExportAssignment = {
    val __obj = js.Dynamic.literal(end = end, expression = expression, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSExportAssignment]
  }
}

