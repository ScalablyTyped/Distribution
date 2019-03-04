package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait UnaryExpression
  extends Expression
     with BaseNode
     with UnaryLike {
  var argument: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.void | atBabelTypesLib.atBabelTypesLibStrings.`throw` | atBabelTypesLib.atBabelTypesLibStrings.delete | atBabelTypesLib.atBabelTypesLibStrings.`!` | atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`~` | atBabelTypesLib.atBabelTypesLibStrings.typeof
  var prefix: scala.Boolean
  @JSName("type")
  var type_UnaryExpression: atBabelTypesLib.atBabelTypesLibStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: atBabelTypesLib.atBabelTypesLibStrings.void | atBabelTypesLib.atBabelTypesLibStrings.`throw` | atBabelTypesLib.atBabelTypesLibStrings.delete | atBabelTypesLib.atBabelTypesLibStrings.`!` | atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`~` | atBabelTypesLib.atBabelTypesLibStrings.typeof,
    prefix: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.UnaryExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument, operator = operator.asInstanceOf[js.Any], prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnaryExpression]
  }
}

