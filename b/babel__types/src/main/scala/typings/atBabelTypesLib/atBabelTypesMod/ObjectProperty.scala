package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait ObjectProperty
  extends ObjectMember
     with BaseNode
     with Property
     with UserWhitespacable {
  var computed: scala.Boolean
  var decorators: js.Array[Decorator] | scala.Null
  var key: js.Any
  var shorthand: scala.Boolean
  @JSName("type")
  var type_ObjectProperty: atBabelTypesLib.atBabelTypesLibStrings.ObjectProperty
  var value: Expression | PatternLike
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: js.Any,
    shorthand: scala.Boolean,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.ObjectProperty,
    value: Expression | PatternLike,
    decorators: js.Array[Decorator] = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, shorthand = shorthand, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectProperty]
  }
}

