package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledStatement
  extends Node
     with Statement {
  var body: Statement
  var label: Identifier
  @JSName("type")
  var type_LabeledStatement: babelDashTypesLib.babelDashTypesLibStrings.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: Statement,
    end: scala.Double,
    label: Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.LabeledStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body, end = end, label = label, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LabeledStatement]
  }
}

