package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`private`
import typings.atBabelTypes.atBabelTypesStrings.`protected`
import typings.atBabelTypes.atBabelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSParameterProperty
  extends LVal
     with BaseNode {
  var accessibility: public | `private` | `protected` | Null
  var parameter: Identifier | AssignmentPattern
  var readonly: Boolean | Null
  @JSName("type")
  var type_TSParameterProperty: typings.atBabelTypes.atBabelTypesStrings.TSParameterProperty
}

object TSParameterProperty {
  @scala.inline
  def apply(
    parameter: Identifier | AssignmentPattern,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSParameterProperty,
    accessibility: public | `private` | `protected` = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty]
  }
}

@JSImport("@babel/types", "tsParameterProperty")
@js.native
object tsParameterProperty extends js.Object {
  def apply(parameter: AssignmentPattern): TSParameterProperty = js.native
  def apply(parameter: AssignmentPattern, accessibility: Null, readonly: Boolean): TSParameterProperty = js.native
  def apply(parameter: Identifier): TSParameterProperty = js.native
  def apply(parameter: Identifier, accessibility: Null, readonly: Boolean): TSParameterProperty = js.native
}

