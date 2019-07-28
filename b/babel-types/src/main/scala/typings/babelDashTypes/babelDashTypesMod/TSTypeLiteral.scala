package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeLiteral
  extends Node
     with TSType {
  var members: js.Array[TSTypeElement]
  @JSName("type")
  var type_TSTypeLiteral: typings.babelDashTypes.babelDashTypesStrings.TSTypeLiteral
}

object TSTypeLiteral {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    members: js.Array[TSTypeElement],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSTypeLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeLiteral = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, members = members, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeLiteral]
  }
}

