package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXElement_
  extends Node
     with Expression
     with Immutable
     with JSX {
  var children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_] = js.native
  var closingElement: JSXClosingElement_ = js.native
  var openingElement: JSXOpeningElement_ = js.native
  var selfClosing: js.UndefOr[Boolean] = js.native
  @JSName("type")
  var type_JSXElement_ : JSXElement = js.native
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
    `type`: JSXElement
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement_]
  }
  @scala.inline
  implicit class JSXElement_Ops[Self <: JSXElement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: (JSXElement_ | JSXExpressionContainer_ | JSXText_)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosingElement(value: JSXClosingElement_): Self = this.set("closingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpeningElement(value: JSXOpeningElement_): Self = this.set("openingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: JSXElement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelfClosing(value: Boolean): Self = this.set("selfClosing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfClosing: Self = this.set("selfClosing", js.undefined)
  }
  
}

