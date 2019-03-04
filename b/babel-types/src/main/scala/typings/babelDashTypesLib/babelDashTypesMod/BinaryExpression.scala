package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`/` | babelDashTypesLib.babelDashTypesLibStrings.`%` | babelDashTypesLib.babelDashTypesLibStrings.`*` | babelDashTypesLib.babelDashTypesLibStrings.`**` | babelDashTypesLib.babelDashTypesLibStrings.`&` | babelDashTypesLib.babelDashTypesLibStrings.`|` | babelDashTypesLib.babelDashTypesLibStrings.`>>` | babelDashTypesLib.babelDashTypesLibStrings.`>>>` | babelDashTypesLib.babelDashTypesLibStrings.`<<` | babelDashTypesLib.babelDashTypesLibStrings.`_backtick^_backtick` | babelDashTypesLib.babelDashTypesLibStrings.`==` | babelDashTypesLib.babelDashTypesLibStrings.`===` | babelDashTypesLib.babelDashTypesLibStrings.`!=` | babelDashTypesLib.babelDashTypesLibStrings.`!==` | babelDashTypesLib.babelDashTypesLibStrings.in | babelDashTypesLib.babelDashTypesLibStrings.instanceof | babelDashTypesLib.babelDashTypesLibStrings.`>` | babelDashTypesLib.babelDashTypesLibStrings.`<` | babelDashTypesLib.babelDashTypesLibStrings.`>=` | babelDashTypesLib.babelDashTypesLibStrings.`<=`
  var right: Expression
  @JSName("type")
  var type_BinaryExpression: babelDashTypesLib.babelDashTypesLibStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    left: Expression,
    loc: SourceLocation,
    operator: babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`/` | babelDashTypesLib.babelDashTypesLibStrings.`%` | babelDashTypesLib.babelDashTypesLibStrings.`*` | babelDashTypesLib.babelDashTypesLibStrings.`**` | babelDashTypesLib.babelDashTypesLibStrings.`&` | babelDashTypesLib.babelDashTypesLibStrings.`|` | babelDashTypesLib.babelDashTypesLibStrings.`>>` | babelDashTypesLib.babelDashTypesLibStrings.`>>>` | babelDashTypesLib.babelDashTypesLibStrings.`<<` | babelDashTypesLib.babelDashTypesLibStrings.`_backtick^_backtick` | babelDashTypesLib.babelDashTypesLibStrings.`==` | babelDashTypesLib.babelDashTypesLibStrings.`===` | babelDashTypesLib.babelDashTypesLibStrings.`!=` | babelDashTypesLib.babelDashTypesLibStrings.`!==` | babelDashTypesLib.babelDashTypesLibStrings.in | babelDashTypesLib.babelDashTypesLibStrings.instanceof | babelDashTypesLib.babelDashTypesLibStrings.`>` | babelDashTypesLib.babelDashTypesLibStrings.`<` | babelDashTypesLib.babelDashTypesLibStrings.`>=` | babelDashTypesLib.babelDashTypesLibStrings.`<=`,
    right: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.BinaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, operator = operator.asInstanceOf[js.Any], right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BinaryExpression]
  }
}

