package typings.d3Selection.mod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterElement extends js.Object {
  var namespaceURI: String = js.native
  var ownerDocument: Document = js.native
  def appendChild(newChild: Node): Node = js.native
  def insertBefore(newChild: Node, refChild: Node): Node = js.native
  def querySelector(selectors: String): Element = js.native
  def querySelectorAll(selectors: String): NodeListOf[Element] = js.native
}

object EnterElement {
  @scala.inline
  def apply(
    appendChild: Node => Node,
    insertBefore: (Node, Node) => Node,
    namespaceURI: String,
    ownerDocument: Document,
    querySelector: String => Element,
    querySelectorAll: String => NodeListOf[Element]
  ): EnterElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), namespaceURI = namespaceURI.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
    __obj.asInstanceOf[EnterElement]
  }
  @scala.inline
  implicit class EnterElementOps[Self <: EnterElement] (val x: Self) extends AnyVal {
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
    def setAppendChild(value: Node => Node): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertBefore(value: (Node, Node) => Node): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerDocument(value: Document): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuerySelector(value: String => Element): Self = this.set("querySelector", js.Any.fromFunction1(value))
    @scala.inline
    def setQuerySelectorAll(value: String => NodeListOf[Element]): Self = this.set("querySelectorAll", js.Any.fromFunction1(value))
  }
  
}

