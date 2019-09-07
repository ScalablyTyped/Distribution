package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter
  extends BaseNode
     with _Node {
  var constraint: TSType | Null
  var default: TSType | Null
  var name: String
  @JSName("type")
  var type_TSTypeParameter: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

