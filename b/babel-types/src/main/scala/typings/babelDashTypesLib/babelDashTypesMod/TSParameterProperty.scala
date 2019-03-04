package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParameterProperty
  extends Node
     with LVal {
  var accessibility: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` | scala.Null
  var parameter: Identifier | AssignmentPattern
  var readonly: scala.Boolean | scala.Null
  @JSName("type")
  var type_TSParameterProperty: babelDashTypesLib.babelDashTypesLibStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    end: scala.Double,
    loc: SourceLocation,
    parameter: Identifier | AssignmentPattern,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.TSParameterProperty,
    accessibility: babelDashTypesLib.babelDashTypesLibStrings.public | babelDashTypesLib.babelDashTypesLibStrings.`private` | babelDashTypesLib.babelDashTypesLibStrings.`protected` = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, parameter = parameter.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSParameterProperty]
  }
}

