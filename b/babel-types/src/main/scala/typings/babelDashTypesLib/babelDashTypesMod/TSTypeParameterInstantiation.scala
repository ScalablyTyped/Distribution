package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterInstantiation extends Node {
  var params: js.Array[TSType]
  @JSName("type")
  var type_TSTypeParameterInstantiation: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameterInstantiation
}

object TSTypeParameterInstantiation {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    params: js.Array[TSType],
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSTypeParameterInstantiation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameterInstantiation]
  }
}

