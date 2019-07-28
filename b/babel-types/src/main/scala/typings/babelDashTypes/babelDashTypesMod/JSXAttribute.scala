package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXAttribute
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier | JSXNamespacedName
  @JSName("type")
  var type_JSXAttribute: typings.babelDashTypes.babelDashTypesStrings.JSXAttribute
  var value: JSXElement | StringLiteral | JSXExpressionContainer | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXNamespacedName,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXAttribute,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    value: JSXElement | StringLiteral | JSXExpressionContainer = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}

