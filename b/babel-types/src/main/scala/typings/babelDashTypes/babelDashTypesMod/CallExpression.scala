package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallExpression
  extends Node
     with Expression {
  var arguments: js.Array[Expression | SpreadElement]
  var callee: Expression | Super
  @JSName("type")
  var type_CallExpression: typings.babelDashTypes.babelDashTypesStrings.CallExpression
}

object CallExpression {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.CallExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee.asInstanceOf[js.Any], end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[CallExpression]
  }
}

@JSImport("babel-types", "callExpression")
@js.native
object callExpression extends js.Object {
  def apply(): CallExpression = js.native
  def apply(callee: Expression): CallExpression = js.native
  def apply(callee: Expression, _arguments: js.Array[Expression | SpreadElement]): CallExpression = js.native
}

