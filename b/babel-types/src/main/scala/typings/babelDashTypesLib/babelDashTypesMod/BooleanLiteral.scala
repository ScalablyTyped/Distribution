package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  @JSName("type")
  var type_BooleanLiteral: babelDashTypesLib.babelDashTypesLibStrings.BooleanLiteral
  var value: scala.Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.BooleanLiteral,
    value: scala.Boolean,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

