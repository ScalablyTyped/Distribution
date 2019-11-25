package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXElement
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingElement: JSXClosingElement | Null
  var openingElement: JSXOpeningElement
  var selfClosing: js.Any
  @JSName("type")
  var type_JSXElement: typings.atBabelTypes.atBabelTypesStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement,
    selfClosing: js.Any,
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXElement,
    closingElement: JSXClosingElement = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement]
  }
}

@JSImport("@babel/types", "jsxElement")
@js.native
object jsxElement extends js.Object {
  def apply(
    openingElement: JSXOpeningElement,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElement,
    closingElement: Null,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def apply(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
}

