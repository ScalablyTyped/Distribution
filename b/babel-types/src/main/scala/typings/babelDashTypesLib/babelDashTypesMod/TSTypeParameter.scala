package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameter extends Node {
  var constraint: TSType | scala.Null
  var default: TSType | scala.Null
  var name: java.lang.String | scala.Null
  @JSName("type")
  var type_TSTypeParameter: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameter,
    constraint: TSType = null,
    default: TSType = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    name: java.lang.String = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (name != null) __obj.updateDynamic("name")(name)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

