package typings.babelDashTypes.babelDashTypesMod

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
  var selfClosing: js.UndefOr[Boolean] = js.undefined
  @JSName("type")
  var type_JSXElement: typings.babelDashTypes.babelDashTypesStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText],
    closingElement: JSXClosingElement,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.JSXElement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    selfClosing: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
}

@JSImport("babel-types", "jSXElement")
@js.native
object jSXElement extends js.Object {
  def apply(): JSXElement = js.native
  def apply(openingElement: JSXOpeningElement): JSXElement = js.native
  def apply(openingElement: JSXOpeningElement, closingElement: JSXClosingElement): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText]
  ): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText],
    selfClosing: Boolean
  ): JSXElement = js.native
}

