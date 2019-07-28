package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberExpression
  extends Node
     with Expression
     with LVal {
  var computed: Boolean
  var `object`: Expression | Super
  var property: Expression
  @JSName("type")
  var type_MemberExpression: typings.babelDashTypes.babelDashTypesStrings.MemberExpression
}

object MemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.MemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed, end = end, loc = loc, property = property, start = start)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MemberExpression]
  }
}

