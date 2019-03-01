package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayExpression
  extends Node
     with Expression {
  var elements: js.Array[scala.Null | Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: babelDashTypesLib.babelDashTypesLibStrings.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[scala.Null | Expression | SpreadElement],
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ArrayExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elements")(elements)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayExpression]
  }
}

