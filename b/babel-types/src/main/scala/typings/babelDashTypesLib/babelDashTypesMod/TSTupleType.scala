package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTupleType
  extends Node
     with TSType {
  var elementTypes: js.Array[TSType]
  @JSName("type")
  var type_TSTupleType: babelDashTypesLib.babelDashTypesLibStrings.TSTupleType
}

object TSTupleType {
  @scala.inline
  def apply(
    elementTypes: js.Array[TSType],
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTupleType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTupleType]
  }
}

