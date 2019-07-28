package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SequenceExpression
  extends Node
     with Expression {
  var expressions: js.Array[Expression]
  @JSName("type")
  var type_SequenceExpression: typings.babelDashTypes.babelDashTypesStrings.SequenceExpression
}

object SequenceExpression {
  @scala.inline
  def apply(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.SequenceExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): SequenceExpression = {
    val __obj = js.Dynamic.literal(end = end, expressions = expressions, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SequenceExpression]
  }
}

