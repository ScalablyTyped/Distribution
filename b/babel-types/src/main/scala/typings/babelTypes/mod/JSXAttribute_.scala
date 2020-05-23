package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute_
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier_ | JSXNamespacedName_
  @JSName("type")
  var type_JSXAttribute_ : JSXAttribute
  var value: JSXElement_ | StringLiteral_ | JSXExpressionContainer_ | Null
}

object JSXAttribute_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXNamespacedName_,
    start: Double,
    `type`: JSXAttribute,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement_ | StringLiteral_ | JSXExpressionContainer_ = null
  ): JSXAttribute_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute_]
  }
}

