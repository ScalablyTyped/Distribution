package typings
package babelDashTypesLib.babelDashTypesMod

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
  var type_ContinueStatement: babelDashTypesLib.babelDashTypesLibStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    end: scala.Double,
    label: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ContinueStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ContinueStatement]
  }
}

