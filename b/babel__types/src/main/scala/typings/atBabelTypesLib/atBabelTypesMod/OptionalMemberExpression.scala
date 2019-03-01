package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait OptionalMemberExpression
  extends Expression
     with BaseNode {
  var computed: scala.Boolean
  var `object`: Expression
  var optional: scala.Boolean
  var property: js.Any
  @JSName("type")
  var type_OptionalMemberExpression: atBabelTypesLib.atBabelTypesLibStrings.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    `object`: Expression,
    optional: scala.Boolean,
    property: js.Any,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.OptionalMemberExpression,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("property")(property)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}

