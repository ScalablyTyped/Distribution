package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitExpression
  extends Node
     with Expression
     with Terminatorless {
  var argument: Expression
  @JSName("type")
  var type_AwaitExpression: babelDashTypesLib.babelDashTypesLibStrings.AwaitExpression
}

object AwaitExpression {
  @scala.inline
  def apply(
    argument: Expression,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.AwaitExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AwaitExpression = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AwaitExpression]
  }
}

