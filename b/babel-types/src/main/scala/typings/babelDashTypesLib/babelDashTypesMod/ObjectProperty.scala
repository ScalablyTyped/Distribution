package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectProperty
  extends Node
     with ObjectMember
     with Property
     with UserWhitespacable {
  var computed: scala.Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Expression
  var shorthand: scala.Boolean
  @JSName("type")
  var type_ObjectProperty: babelDashTypesLib.babelDashTypesLibStrings.ObjectProperty
  var value: Expression
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    end: scala.Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: scala.Boolean,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.ObjectProperty,
    value: Expression,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectProperty = {
    val __obj = js.Dynamic.literal(computed = computed, end = end, key = key, loc = loc, shorthand = shorthand, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectProperty]
  }
}

