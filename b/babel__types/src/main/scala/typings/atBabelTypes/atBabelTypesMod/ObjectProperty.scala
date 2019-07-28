package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ObjectProperty
  extends ObjectMember
     with BaseNode
     with Property
     with UserWhitespacable {
  var computed: Boolean
  var decorators: js.Array[Decorator] | Null
  var key: js.Any
  var shorthand: Boolean
  @JSName("type")
  var type_ObjectProperty: typings.atBabelTypes.atBabelTypesStrings.ObjectProperty
  var value: Expression | PatternLike
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: js.Any,
    shorthand: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ObjectProperty,
    value: Expression | PatternLike,
    decorators: js.Array[Decorator] = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
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

