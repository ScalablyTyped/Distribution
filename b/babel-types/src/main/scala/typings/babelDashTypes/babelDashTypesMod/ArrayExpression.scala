package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayExpression
  extends Node
     with Expression {
  var elements: js.Array[Null | Expression | SpreadElement]
  @JSName("type")
  var type_ArrayExpression: typings.babelDashTypes.babelDashTypesStrings.ArrayExpression
}

object ArrayExpression {
  @scala.inline
  def apply(
    elements: js.Array[Null | Expression | SpreadElement],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ArrayExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrayExpression = {
    val __obj = js.Dynamic.literal(elements = elements, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrayExpression]
  }
}

