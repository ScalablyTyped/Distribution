package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Node
     with Expression
     with UnaryLike {
  var argument: Expression
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`!` | babelDashTypesLib.babelDashTypesLibStrings.`~` | babelDashTypesLib.babelDashTypesLibStrings.typeof | babelDashTypesLib.babelDashTypesLibStrings.void | babelDashTypesLib.babelDashTypesLibStrings.delete
  var prefix: scala.Boolean
  @JSName("type")
  var type_UnaryExpression: babelDashTypesLib.babelDashTypesLibStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    end: scala.Double,
    loc: SourceLocation,
    operator: babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`!` | babelDashTypesLib.babelDashTypesLibStrings.`~` | babelDashTypesLib.babelDashTypesLibStrings.typeof | babelDashTypesLib.babelDashTypesLibStrings.void | babelDashTypesLib.babelDashTypesLibStrings.delete,
    prefix: scala.Boolean,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.UnaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("argument")(argument)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnaryExpression]
  }
}

