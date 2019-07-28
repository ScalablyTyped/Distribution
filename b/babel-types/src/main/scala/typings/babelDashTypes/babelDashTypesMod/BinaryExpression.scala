package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`!==`
import typings.babelDashTypes.babelDashTypesStrings.`!=`
import typings.babelDashTypes.babelDashTypesStrings.`%`
import typings.babelDashTypes.babelDashTypesStrings.`&`
import typings.babelDashTypes.babelDashTypesStrings.`**`
import typings.babelDashTypes.babelDashTypesStrings.`+`
import typings.babelDashTypes.babelDashTypesStrings.`-`
import typings.babelDashTypes.babelDashTypesStrings.`/`
import typings.babelDashTypes.babelDashTypesStrings.`<<`
import typings.babelDashTypes.babelDashTypesStrings.`<=`
import typings.babelDashTypes.babelDashTypesStrings.`<`
import typings.babelDashTypes.babelDashTypesStrings.`===`
import typings.babelDashTypes.babelDashTypesStrings.`==`
import typings.babelDashTypes.babelDashTypesStrings.`>=`
import typings.babelDashTypes.babelDashTypesStrings.`>>>`
import typings.babelDashTypes.babelDashTypesStrings.`>>`
import typings.babelDashTypes.babelDashTypesStrings.`>`
import typings.babelDashTypes.babelDashTypesStrings.`_backtick^_backtick`
import typings.babelDashTypes.babelDashTypesStrings.in
import typings.babelDashTypes.babelDashTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryExpression
  extends Node
     with Binary
     with Expression {
  var left: Expression
  var operator: `+` | `-` | `/` | `%` | typings.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typings.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`
  var right: Expression
  @JSName("type")
  var type_BinaryExpression: typings.babelDashTypes.babelDashTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: `+` | `-` | `/` | `%` | typings.babelDashTypes.babelDashTypesStrings.`*` | `**` | `&` | typings.babelDashTypes.babelDashTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BinaryExpression,
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

