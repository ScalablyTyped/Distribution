package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesNumbers.`false`
import typings.atBabelTypes.atBabelTypesNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait MemberExpression
  extends Expression
     with BaseNode
     with LVal {
  var computed: Boolean
  var `object`: Expression
  var optional: `true` | `false` | Null
  var property: js.Any
  @JSName("type")
  var type_MemberExpression: typings.atBabelTypes.atBabelTypesStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression,
    property: js.Any,
    `type`: typings.atBabelTypes.atBabelTypesStrings.MemberExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    optional: `true` | `false` = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, property = property)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MemberExpression]
  }
}

