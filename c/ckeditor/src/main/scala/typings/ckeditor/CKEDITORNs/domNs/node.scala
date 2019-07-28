package typings.ckeditor.CKEDITORNs.domNs

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.node")
@js.native
class node protected () extends domObject {
  def this(domNode: Node) = this()
  var `type`: Double = js.native
  def appendTo(element: element): element = js.native
  def clone(includeChildren: Boolean, cloneId: Boolean): node = js.native
  def getAddress(): js.Array[Double] = js.native
  def getAddress(normalized: Boolean): js.Array[Double] = js.native
  def getAscendant(reference: String): node = js.native
  def getAscendant(reference: String, includeSelf: Boolean): node = js.native
  def getCommonAncestor(node: node): Unit = js.native
  def getDocument(): document = js.native
  def getIndex(): Double = js.native
  def getIndex(normalized: Boolean): Double = js.native
  def getNext(): node = js.native
  def getNext(evaluator: js.Function1[/* node */ this.type, Boolean]): node = js.native
  def getNextSourceNode(): node = js.native
  def getNextSourceNode(startFromSibling: Boolean): node = js.native
  def getNextSourceNode(startFromSibling: Boolean, nodeType: Double): node = js.native
  def getNextSourceNode(startFromSibling: Boolean, nodeType: Double, guard: js.Function1[/* node */ this.type, Boolean]): node = js.native
  def getNextSourceNode(startFromSibling: Boolean, nodeType: Double, guard: node): node = js.native
  def getParent(): element = js.native
  def getParent(allowFragmentParent: Boolean): element = js.native
  def getParents(): js.Array[node] = js.native
  def getParents(closerFirst: Boolean): js.Array[node] = js.native
  def getPosition(otherNode: node): Unit = js.native
  def getPrevious(): node = js.native
  def getPrevious(evaluator: js.Function1[/* node */ this.type, Boolean]): node = js.native
  def getPreviousSourceNode(): node = js.native
  def getPreviousSourceNode(startFromSibling: Boolean): node = js.native
  def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double): node = js.native
  def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double, guard: js.Function1[/* node */ this.type, Boolean]): node = js.native
  def getPreviousSourceNode(startFromSibling: Boolean, nodeType: Double, guard: node): node = js.native
  def hasAscendant(name: String, includeSelf: Boolean): Boolean = js.native
  def hasNext(): Boolean = js.native
  def hasPrevious(): Boolean = js.native
  def insertAfter(node: node): node = js.native
  def insertBefore(node: node): node = js.native
  def insertBeforeMe(node: node): node = js.native
  def isReadOnly(): Boolean = js.native
  def ltrim(): Unit = js.native
  def remove(): node = js.native
  def remove(preserveChildren: Boolean): node = js.native
  def replace(nodeToReplace: node): Unit = js.native
  def rtrim(): Unit = js.native
  def trim(): Unit = js.native
}

