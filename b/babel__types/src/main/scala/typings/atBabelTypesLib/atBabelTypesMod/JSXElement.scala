package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait JSXElement
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  var closingElement: JSXClosingElement | scala.Null
  var openingElement: JSXOpeningElement
  var selfClosing: js.Any
  @JSName("type")
  var type_JSXElement: atBabelTypesLib.atBabelTypesLibStrings.JSXElement
}

object JSXElement {
  @scala.inline
  def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement,
    selfClosing: js.Any,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.JSXElement,
    closingElement: JSXClosingElement = null,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXElement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("openingElement")(openingElement)
    __obj.updateDynamic("selfClosing")(selfClosing)
    if (closingElement != null) __obj.updateDynamic("closingElement")(closingElement)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXElement]
  }
}

