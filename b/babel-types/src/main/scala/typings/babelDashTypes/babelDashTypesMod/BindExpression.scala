package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindExpression
  extends Node
     with Expression {
  var callee: Expression
  var `object`: Expression
  @JSName("type")
  var type_BindExpression: typings.babelDashTypes.babelDashTypesStrings.BindExpression
}

object BindExpression {
  @scala.inline
  def apply(
    callee: Expression,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BindExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): BindExpression = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindExpression]
  }
}

@JSImport("babel-types", "bindExpression")
@js.native
object bindExpression extends js.Object {
  def apply(): BindExpression = js.native
  def apply(`object`: Expression): BindExpression = js.native
  def apply(`object`: Expression, callee: Expression): BindExpression = js.native
}

