package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTypeParameterInstantiation
  extends BaseNode
     with _Node {
  var params: js.Array[TSType]
  @JSName("type")
  var type_TSTypeParameterInstantiation: atBabelTypesLib.atBabelTypesLibStrings.TSTypeParameterInstantiation
}

object TSTypeParameterInstantiation {
  @scala.inline
  def apply(
    params: js.Array[TSType],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSTypeParameterInstantiation,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("params")(params)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSTypeParameterInstantiation]
  }
}

