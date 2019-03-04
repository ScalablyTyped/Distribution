package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalExpression
  extends Node
     with Conditional
     with Expression {
  var alternate: Expression
  var consequent: Expression
  var test: Expression
  @JSName("type")
  var type_ConditionalExpression: babelDashTypesLib.babelDashTypesLibStrings.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: Expression,
    consequent: Expression,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    test: Expression,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ConditionalExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate, consequent = consequent, end = end, loc = loc, start = start, test = test)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ConditionalExpression]
  }
}

