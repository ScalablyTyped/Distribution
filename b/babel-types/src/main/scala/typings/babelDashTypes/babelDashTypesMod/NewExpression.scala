package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewExpression
  extends Node
     with Expression {
  var arguments: js.Array[Expression | SpreadElement]
  var callee: Expression | Super
  @JSName("type")
  var type_NewExpression: typings.babelDashTypes.babelDashTypesStrings.NewExpression
}

object NewExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.NewExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any], end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[NewExpression]
  }
}

