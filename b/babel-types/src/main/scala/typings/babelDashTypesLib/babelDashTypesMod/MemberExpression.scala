package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Node
     with Expression
     with LVal {
  var computed: scala.Boolean
  var `object`: Expression | Super
  var property: Expression
  @JSName("type")
  var type_MemberExpression: babelDashTypesLib.babelDashTypesLibStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    end: scala.Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.MemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(`object` = `object`.asInstanceOf[js.Any], `type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("property")(property)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MemberExpression]
  }
}

