package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentExpression
  extends Node
     with Expression {
  var left: LVal
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`=` | babelDashTypesLib.babelDashTypesLibStrings.`+=` | babelDashTypesLib.babelDashTypesLibStrings.`-=` | babelDashTypesLib.babelDashTypesLibStrings.`*=` | babelDashTypesLib.babelDashTypesLibStrings.`/=` | babelDashTypesLib.babelDashTypesLibStrings.`%=` | babelDashTypesLib.babelDashTypesLibStrings.`<<=` | babelDashTypesLib.babelDashTypesLibStrings.`>>=` | babelDashTypesLib.babelDashTypesLibStrings.`>>>=` | babelDashTypesLib.babelDashTypesLibStrings.`|=` | babelDashTypesLib.babelDashTypesLibStrings.`^=` | babelDashTypesLib.babelDashTypesLibStrings.`&=`
  var right: Expression
  @JSName("type")
  var type_AssignmentExpression: babelDashTypesLib.babelDashTypesLibStrings.AssignmentExpression
}

object AssignmentExpression {
  @scala.inline
  def apply(
    end: scala.Double,
    left: LVal,
    loc: SourceLocation,
    operator: babelDashTypesLib.babelDashTypesLibStrings.`=` | babelDashTypesLib.babelDashTypesLibStrings.`+=` | babelDashTypesLib.babelDashTypesLibStrings.`-=` | babelDashTypesLib.babelDashTypesLibStrings.`*=` | babelDashTypesLib.babelDashTypesLibStrings.`/=` | babelDashTypesLib.babelDashTypesLibStrings.`%=` | babelDashTypesLib.babelDashTypesLibStrings.`<<=` | babelDashTypesLib.babelDashTypesLibStrings.`>>=` | babelDashTypesLib.babelDashTypesLibStrings.`>>>=` | babelDashTypesLib.babelDashTypesLibStrings.`|=` | babelDashTypesLib.babelDashTypesLibStrings.`^=` | babelDashTypesLib.babelDashTypesLibStrings.`&=`,
    right: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.AssignmentExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentExpression = {
    val __obj = js.Dynamic.literal(end = end, left = left, loc = loc, operator = operator.asInstanceOf[js.Any], right = right, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentExpression]
  }
}

