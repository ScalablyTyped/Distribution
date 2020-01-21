package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression_
  extends Node
     with Expression {
  var properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_]
  @JSName("type")
  var type_ObjectExpression_ : ObjectExpression
}

object ObjectExpression_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[ObjectProperty_ | ObjectMethod_ | SpreadProperty_],
    start: Double,
    `type`: ObjectExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExpression_]
  }
}

