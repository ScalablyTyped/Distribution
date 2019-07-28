package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXClosingElement
  extends Node
     with Immutable
     with JSX {
  var name: JSXIdentifier | JSXMemberExpression
  @JSName("type")
  var type_JSXClosingElement: typings.babelDashTypes.babelDashTypesStrings.JSXClosingElement
}

object JSXClosingElement {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXMemberExpression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXClosingElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingElement = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXClosingElement]
  }
}

