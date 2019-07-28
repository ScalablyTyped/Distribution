package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXMemberExpression
  extends Node
     with Expression
     with JSX {
  var `object`: JSXMemberExpression | JSXIdentifier
  var property: JSXIdentifier
  @JSName("type")
  var type_JSXMemberExpression: typings.babelDashTypes.babelDashTypesStrings.JSXMemberExpression
}

object JSXMemberExpression {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression | JSXIdentifier,
    property: JSXIdentifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXMemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, property = property, start = start)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXMemberExpression]
  }
}

