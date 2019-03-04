package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSXElement
  extends Node
     with Expression
     with Immutable
     with JSX {
  var children: js.Array[JSXElement | JSXExpressionContainer | JSXText]
  var closingElement: JSXClosingElement
  var openingElement: JSXOpeningElement
  var selfClosing: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_JSXElement: babelDashTypesLib.babelDashTypesLibStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText],
    closingElement: JSXClosingElement,
    end: scala.Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.JSXElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    selfClosing: js.UndefOr[scala.Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children, closingElement = closingElement, end = end, loc = loc, openingElement = openingElement, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXElement]
  }
}

