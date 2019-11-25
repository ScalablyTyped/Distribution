package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewExpression
  extends Node
     with Expression {
  var arguments: js.Array[Expression | SpreadElement]
  var callee: Expression | Super
  @JSName("type")
  var type_NewExpression: typings.babelDashTypes.babelDashTypesStrings.NewExpression
}

object NewExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.NewExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): NewExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExpression]
  }
}

@JSImport("babel-types", "newExpression")
@js.native
object newExpression extends js.Object {
  def apply(): NewExpression = js.native
  def apply(callee: Expression): NewExpression = js.native
  def apply(callee: Expression, _arguments: js.Array[Expression | SpreadElement]): NewExpression = js.native
  def apply(callee: Super): NewExpression = js.native
  def apply(callee: Super, _arguments: js.Array[Expression | SpreadElement]): NewExpression = js.native
}

