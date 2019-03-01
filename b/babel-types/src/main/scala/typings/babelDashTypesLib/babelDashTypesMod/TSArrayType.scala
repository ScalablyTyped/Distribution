package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSArrayType
  extends Node
     with TSType {
  var elementType: TSType
  @JSName("type")
  var type_TSArrayType: babelDashTypesLib.babelDashTypesLibStrings.TSArrayType
}

object TSArrayType {
  @scala.inline
  def apply(
    elementType: TSType,
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSArrayType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSArrayType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("elementType")(elementType)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSArrayType]
  }
}

