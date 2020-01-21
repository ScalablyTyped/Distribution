package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXMemberExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXMemberExpression_
  extends Node
     with Expression
     with JSX {
  var `object`: JSXMemberExpression_ | JSXIdentifier_
  var property: JSXIdentifier_
  @JSName("type")
  var type_JSXMemberExpression_ : JSXMemberExpression
}

object JSXMemberExpression_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    `object`: JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double,
    `type`: JSXMemberExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXMemberExpression_]
  }
}

