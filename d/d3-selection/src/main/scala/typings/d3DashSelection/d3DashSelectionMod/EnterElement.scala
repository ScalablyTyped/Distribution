package typings.d3DashSelection.d3DashSelectionMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterElement extends js.Object {
  var namespaceURI: String
  var ownerDocument: Document
  def appendChild(newChild: Node): Node
  def insertBefore(newChild: Node, refChild: Node): Node
  def querySelector(selectors: String): Element
  def querySelectorAll(selectors: String): NodeListOf[Element]
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
}

