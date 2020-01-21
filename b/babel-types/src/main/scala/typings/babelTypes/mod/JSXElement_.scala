package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement_
  extends Node
     with Expression
     with Immutable
     with JSX {
  var children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
  var closingElement: JSXClosingElement_
  var openingElement: JSXOpeningElement_
  var selfClosing: js.UndefOr[Boolean] = js.undefined
  @JSName("type")
  var type_JSXElement_ : JSXElement
}

object JSXElement_ {
  @scala.inline
  def apply(
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    selfClosing: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement_]
  }
}

