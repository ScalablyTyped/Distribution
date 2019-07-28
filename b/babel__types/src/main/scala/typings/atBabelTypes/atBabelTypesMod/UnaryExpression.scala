package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`!`
import typings.atBabelTypes.atBabelTypesStrings.`+`
import typings.atBabelTypes.atBabelTypesStrings.`-`
import typings.atBabelTypes.atBabelTypesStrings.`throw`
import typings.atBabelTypes.atBabelTypesStrings.`~`
import typings.atBabelTypes.atBabelTypesStrings.delete
import typings.atBabelTypes.atBabelTypesStrings.typeof
import typings.atBabelTypes.atBabelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait UnaryExpression
  extends Expression
     with BaseNode
     with UnaryLike {
  var argument: Expression
  var operator: void | `throw` | delete | `!` | `+` | `-` | `~` | typeof
  var prefix: Boolean
  @JSName("type")
  var type_UnaryExpression: typings.atBabelTypes.atBabelTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    operator: void | `throw` | delete | `!` | `+` | `-` | `~` | typeof,
    prefix: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.UnaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
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

