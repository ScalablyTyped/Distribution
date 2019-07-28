package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter extends Node {
  var constraint: TSType | Null
  var default: TSType | Null
  var name: String | Null
  @JSName("type")
  var type_TSTypeParameter: typings.babelDashTypes.babelDashTypesStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    name: String = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (name != null) __obj.updateDynamic("name")(name)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

