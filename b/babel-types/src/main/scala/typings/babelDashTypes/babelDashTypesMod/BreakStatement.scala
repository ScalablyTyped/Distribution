package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakStatement
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  var label: Identifier
  @JSName("type")
  var type_BreakStatement: typings.babelDashTypes.babelDashTypesStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    end: Double,
    label: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BreakStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal(end = end, label = label, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BreakStatement]
  }
}

