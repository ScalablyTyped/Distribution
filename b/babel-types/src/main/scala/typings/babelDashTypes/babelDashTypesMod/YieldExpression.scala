package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YieldExpression
  extends Node
     with Expression
     with Terminatorless {
  var argument: Expression
  var delegate: Boolean
  @JSName("type")
  var type_YieldExpression: typings.babelDashTypes.babelDashTypesStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    argument: Expression,
    delegate: Boolean,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.YieldExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(argument = argument, delegate = delegate, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[YieldExpression]
  }
}

