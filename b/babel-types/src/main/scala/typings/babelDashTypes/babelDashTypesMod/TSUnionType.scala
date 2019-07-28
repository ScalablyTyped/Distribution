package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSUnionType
  extends Node
     with TSType {
  @JSName("type")
  var type_TSUnionType: typings.babelDashTypes.babelDashTypesStrings.TSUnionType
  var types: js.Array[TSType]
}

object TSUnionType {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSUnionType,
    types: js.Array[TSType],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSUnionType = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start, types = types)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSUnionType]
  }
}

