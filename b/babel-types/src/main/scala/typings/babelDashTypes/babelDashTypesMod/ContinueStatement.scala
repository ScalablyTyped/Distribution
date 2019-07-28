package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  var label: Identifier
  @JSName("type")
  var type_ContinueStatement: typings.babelDashTypes.babelDashTypesStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    end: Double,
    label: Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ContinueStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal(end = end, label = label, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ContinueStatement]
  }
}

