package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXOpeningElement
  extends Node
     with Immutable
     with JSX {
  var attributes: js.Array[JSXAttribute]
  var name: JSXIdentifier | JSXMemberExpression
  var selfClosing: scala.Boolean
  @JSName("type")
  var type_JSXOpeningElement: babelDashTypesLib.babelDashTypesLibStrings.JSXOpeningElement
}

object JSXOpeningElement {
  @scala.inline
  def apply(
    attributes: js.Array[JSXAttribute],
    end: scala.Double,
    loc: SourceLocation,
    name: JSXIdentifier | JSXMemberExpression,
    selfClosing: scala.Boolean,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXOpeningElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes, end = end, loc = loc, name = name.asInstanceOf[js.Any], selfClosing = selfClosing, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXOpeningElement]
  }
}

