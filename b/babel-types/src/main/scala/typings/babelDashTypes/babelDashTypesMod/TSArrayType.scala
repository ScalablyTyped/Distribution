package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSArrayType
  extends Node
     with TSType {
  var elementType: TSType
  @JSName("type")
  var type_TSArrayType: typings.babelDashTypes.babelDashTypesStrings.TSArrayType
}

object TSArrayType {
  @scala.inline
  def apply(
    elementType: TSType,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSArrayType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSArrayType]
  }
}

