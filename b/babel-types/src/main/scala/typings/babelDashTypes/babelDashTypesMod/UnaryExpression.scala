package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`!`
import typings.babelDashTypes.babelDashTypesStrings.`+`
import typings.babelDashTypes.babelDashTypesStrings.`-`
import typings.babelDashTypes.babelDashTypesStrings.`~`
import typings.babelDashTypes.babelDashTypesStrings.delete
import typings.babelDashTypes.babelDashTypesStrings.typeof
import typings.babelDashTypes.babelDashTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression
  extends Node
     with Expression
     with UnaryLike {
  var argument: Expression
  var operator: `-` | `+` | `!` | `~` | typeof | void | delete
  var prefix: Boolean
  @JSName("type")
  var type_UnaryExpression: typings.babelDashTypes.babelDashTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-` | `+` | `!` | `~` | typeof | void | delete,
    prefix: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.UnaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, operator = operator.asInstanceOf[js.Any], prefix = prefix, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[UnaryExpression]
  }
}

