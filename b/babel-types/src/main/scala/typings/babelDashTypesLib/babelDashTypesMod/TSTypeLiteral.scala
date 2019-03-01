package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeLiteral
  extends Node
     with TSType {
  var members: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSTypeLiteral: babelDashTypesLib.babelDashTypesLibStrings.TSTypeLiteral
}

object TSTypeLiteral {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    members: js.Array[TSTypeElement],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeLiteral = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("members")(members)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeLiteral]
  }
}

