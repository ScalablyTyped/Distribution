package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindExpression
  extends Node
     with Expression {
  var callee: Expression
  var `object`: Expression
  @JSName("type")
  var type_BindExpression: babelDashTypesLib.babelDashTypesLibStrings.BindExpression
}

object BindExpression {
  @scala.inline
  def apply(
    callee: Expression,
    end: scala.Double,
    loc: SourceLocation,
    `object`: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.BindExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BindExpression = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("callee")(callee)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BindExpression]
  }
}

