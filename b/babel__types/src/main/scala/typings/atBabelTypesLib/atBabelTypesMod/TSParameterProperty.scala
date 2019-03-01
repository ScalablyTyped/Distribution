package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait TSParameterProperty
  extends LVal
     with BaseNode {
  var accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
  var parameter: Identifier | AssignmentPattern
  var readonly: scala.Boolean | scala.Null
  @JSName("type")
  var type_TSParameterProperty: atBabelTypesLib.atBabelTypesLibStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    parameter: Identifier | AssignmentPattern,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.TSParameterProperty,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSParameterProperty]
  }
}

