package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.`private`
import typings.babelDashTypes.babelDashTypesStrings.`protected`
import typings.babelDashTypes.babelDashTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSParameterProperty
  extends Node
     with LVal {
  var accessibility: public | `private` | `protected` | Null
  var parameter: Identifier | AssignmentPattern
  var readonly: Boolean | Null
  @JSName("type")
  var type_TSParameterProperty: typings.babelDashTypes.babelDashTypesStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    parameter: Identifier | AssignmentPattern,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.TSParameterProperty,
    accessibility: public | `private` | `protected` = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
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

