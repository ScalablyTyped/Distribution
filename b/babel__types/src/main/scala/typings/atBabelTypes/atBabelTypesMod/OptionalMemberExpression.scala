package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait OptionalMemberExpression
  extends Expression
     with BaseNode {
  var computed: Boolean
  var `object`: Expression
  var optional: Boolean
  var property: js.Any
  @JSName("type")
  var type_OptionalMemberExpression: typings.atBabelTypes.atBabelTypesStrings.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: Expression,
    optional: Boolean,
    property: js.Any,
    `type`: typings.atBabelTypes.atBabelTypesStrings.OptionalMemberExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}

@JSImport("@babel/types", "optionalMemberExpression")
@js.native
object optionalMemberExpression extends js.Object {
  def apply(`object`: Expression, property: js.Any, computed: js.UndefOr[scala.Nothing], optional: Boolean): OptionalMemberExpression = js.native
  def apply(`object`: Expression, property: js.Any, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
}

