package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectProperty
  extends Node
     with ObjectMember
     with Property
     with UserWhitespacable {
  var computed: Boolean
  var decorators: js.UndefOr[js.Array[Decorator]] = js.undefined
  var key: Expression
  var shorthand: Boolean
  @JSName("type")
  var type_ObjectProperty: typings.babelDashTypes.babelDashTypesStrings.ObjectProperty
  var value: Expression
}

object ObjectProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectProperty,
    value: Expression,
    decorators: js.Array[Decorator] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectProperty]
  }
}

@JSImport("babel-types", "objectProperty")
@js.native
object objectProperty extends js.Object {
  def apply(): ObjectProperty = js.native
  def apply(key: Expression): ObjectProperty = js.native
  def apply(key: Expression, value: Expression): ObjectProperty = js.native
  def apply(key: Expression, value: Expression, computed: Boolean): ObjectProperty = js.native
  def apply(key: Expression, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty = js.native
  def apply(
    key: Expression,
    value: Expression,
    computed: Boolean,
    shorthand: Boolean,
    decorators: js.Array[Decorator]
  ): ObjectProperty = js.native
}

