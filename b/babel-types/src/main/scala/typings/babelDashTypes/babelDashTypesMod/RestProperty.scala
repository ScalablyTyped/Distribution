package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestProperty
  extends Node
     with UnaryLike {
  var argument: LVal
  @JSName("type")
  var type_RestProperty: typings.babelDashTypes.babelDashTypesStrings.RestProperty
}

object RestProperty {
  @scala.inline
  def apply(
    argument: LVal,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.RestProperty,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): RestProperty = {
    val __obj = js.Dynamic.literal(argument = argument, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[RestProperty]
  }
}

