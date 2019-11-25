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
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression]
  }
}

@JSImport("babel-types", "memberExpression")
@js.native
object memberExpression extends js.Object {
  def apply(): MemberExpression = js.native
  def apply(`object`: Expression): MemberExpression = js.native
  def apply(`object`: Expression, property: Expression): MemberExpression = js.native
  def apply(`object`: Expression, property: Expression, computed: Boolean): MemberExpression = js.native
  def apply(`object`: Super): MemberExpression = js.native
  def apply(`object`: Super, property: Expression): MemberExpression = js.native
  def apply(`object`: Super, property: Expression, computed: Boolean): MemberExpression = js.native
}

