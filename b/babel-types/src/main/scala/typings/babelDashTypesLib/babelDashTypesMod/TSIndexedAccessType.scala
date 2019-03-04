package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSIndexedAccessType
  extends Node
     with TSType {
  var indexType: TSType
  var objectType: TSType
  @JSName("type")
  var type_TSIndexedAccessType: babelDashTypesLib.babelDashTypesLibStrings.TSIndexedAccessType
}

object TSIndexedAccessType {
  @scala.inline
  def apply(
    end: scala.Double,
    indexType: TSType,
    loc: SourceLocation,
    objectType: TSType,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSIndexedAccessType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(end = end, indexType = indexType, loc = loc, objectType = objectType, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSIndexedAccessType]
  }
}

