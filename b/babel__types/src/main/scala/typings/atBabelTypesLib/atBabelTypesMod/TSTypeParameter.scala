package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter
  extends BaseNode
     with _Node {
  var constraint: TSType | scala.Null
  var default: TSType | scala.Null
  var name: java.lang.String | scala.Null
  @JSName("type")
  var type_TSTypeParameter: atBabelTypesLib.atBabelTypesLibStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    name: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

