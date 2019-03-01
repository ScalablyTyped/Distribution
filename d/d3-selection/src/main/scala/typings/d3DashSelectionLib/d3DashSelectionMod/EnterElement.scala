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
    appendChild: js.Function1[stdLib.Node, stdLib.Node],
    insertBefore: js.Function2[stdLib.Node, stdLib.Node, stdLib.Node],
    namespaceURI: java.lang.String,
    ownerDocument: stdLib.Document,
    querySelector: js.Function1[java.lang.String, stdLib.Element],
    querySelectorAll: js.Function1[java.lang.String, stdLib.NodeListOf[stdLib.Element]]
  ): EnterElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("namespaceURI")(namespaceURI)
    __obj.updateDynamic("ownerDocument")(ownerDocument)
    __obj.updateDynamic("querySelector")(querySelector)
    __obj.updateDynamic("querySelectorAll")(querySelectorAll)
    __obj.asInstanceOf[EnterElement]
  }
}

