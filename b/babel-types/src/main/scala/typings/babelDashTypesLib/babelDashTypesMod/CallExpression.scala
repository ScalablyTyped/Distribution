package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends Node
     with Expression {
  var arguments: js.Array[Expression | SpreadElement]
  var callee: Expression | Super
  @JSName("type")
  var type_CallExpression: babelDashTypesLib.babelDashTypesLibStrings.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.CallExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any], end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[CallExpression]
  }
}

