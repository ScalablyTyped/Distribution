package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterElement extends js.Object {
  var namespaceURI: java.lang.String
  var ownerDocument: stdLib.Document
  def appendChild(newChild: stdLib.Node): stdLib.Node
  def insertBefore(newChild: stdLib.Node, refChild: stdLib.Node): stdLib.Node
  def querySelector(selectors: java.lang.String): stdLib.Element
  def querySelectorAll(selectors: java.lang.String): stdLib.NodeListOf[stdLib.Element]
}

object EnterElement {
  @scala.inline
  def apply(
    appendChild: stdLib.Node => stdLib.Node,
    insertBefore: (stdLib.Node, stdLib.Node) => stdLib.Node,
    namespaceURI: java.lang.String,
    ownerDocument: stdLib.Document,
    querySelector: java.lang.String => stdLib.Element,
    querySelectorAll: java.lang.String => stdLib.NodeListOf[stdLib.Element]
  ): EnterElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), namespaceURI = namespaceURI, ownerDocument = ownerDocument, querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
  
    __obj.asInstanceOf[EnterElement]
  }
}

