package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait BinaryExpression
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`/` | atBabelTypesLib.atBabelTypesLibStrings.`%` | atBabelTypesLib.atBabelTypesLibStrings.`*` | atBabelTypesLib.atBabelTypesLibStrings.`**` | atBabelTypesLib.atBabelTypesLibStrings.`&` | atBabelTypesLib.atBabelTypesLibStrings.`|` | atBabelTypesLib.atBabelTypesLibStrings.`>>` | atBabelTypesLib.atBabelTypesLibStrings.`>>>` | atBabelTypesLib.atBabelTypesLibStrings.`<<` | atBabelTypesLib.atBabelTypesLibStrings.`_backtick^_backtick` | atBabelTypesLib.atBabelTypesLibStrings.`==` | atBabelTypesLib.atBabelTypesLibStrings.`===` | atBabelTypesLib.atBabelTypesLibStrings.`!=` | atBabelTypesLib.atBabelTypesLibStrings.`!==` | atBabelTypesLib.atBabelTypesLibStrings.in | atBabelTypesLib.atBabelTypesLibStrings.instanceof | atBabelTypesLib.atBabelTypesLibStrings.`>` | atBabelTypesLib.atBabelTypesLibStrings.`<` | atBabelTypesLib.atBabelTypesLibStrings.`>=` | atBabelTypesLib.atBabelTypesLibStrings.`<=`
  var right: Expression
  @JSName("type")
  var type_BinaryExpression: atBabelTypesLib.atBabelTypesLibStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`/` | atBabelTypesLib.atBabelTypesLibStrings.`%` | atBabelTypesLib.atBabelTypesLibStrings.`*` | atBabelTypesLib.atBabelTypesLibStrings.`**` | atBabelTypesLib.atBabelTypesLibStrings.`&` | atBabelTypesLib.atBabelTypesLibStrings.`|` | atBabelTypesLib.atBabelTypesLibStrings.`>>` | atBabelTypesLib.atBabelTypesLibStrings.`>>>` | atBabelTypesLib.atBabelTypesLibStrings.`<<` | atBabelTypesLib.atBabelTypesLibStrings.`_backtick^_backtick` | atBabelTypesLib.atBabelTypesLibStrings.`==` | atBabelTypesLib.atBabelTypesLibStrings.`===` | atBabelTypesLib.atBabelTypesLibStrings.`!=` | atBabelTypesLib.atBabelTypesLibStrings.`!==` | atBabelTypesLib.atBabelTypesLibStrings.in | atBabelTypesLib.atBabelTypesLibStrings.instanceof | atBabelTypesLib.atBabelTypesLibStrings.`>` | atBabelTypesLib.atBabelTypesLibStrings.`<` | atBabelTypesLib.atBabelTypesLibStrings.`>=` | atBabelTypesLib.atBabelTypesLibStrings.`<=`,
    right: Expression,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.BinaryExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BinaryExpression]
  }
}

