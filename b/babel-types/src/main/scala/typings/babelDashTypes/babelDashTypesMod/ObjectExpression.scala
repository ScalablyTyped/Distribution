package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression
  extends Node
     with Expression {
  var properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty]
  @JSName("type")
  var type_ObjectExpression: typings.babelDashTypes.babelDashTypesStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, properties = properties, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectExpression]
  }
}

