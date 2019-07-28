package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentProperty extends Node {
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Expression
  var shorthand: Boolean
  @JSName("type")
  var type_AssignmentProperty: typings.babelDashTypes.babelDashTypesStrings.ObjectProperty
  var value: Pattern
}

object AssignmentProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectProperty,
    value: Pattern,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed, end = end, key = key, loc = loc, shorthand = shorthand, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentProperty]
  }
}

