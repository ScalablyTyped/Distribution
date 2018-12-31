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

