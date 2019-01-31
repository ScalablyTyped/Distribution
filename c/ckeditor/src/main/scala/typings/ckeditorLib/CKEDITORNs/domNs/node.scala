package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.node")
@js.native
class node protected () extends domObject {
  def this(domNode: stdLib.Node) = this()
  var `type`: scala.Double = js.native
  def appendTo(element: element): element = js.native
  def clone(includeChildren: scala.Boolean, cloneId: scala.Boolean): node = js.native
  def getAddress(): js.Array[scala.Double] = js.native
  def getAddress(normalized: scala.Boolean): js.Array[scala.Double] = js.native
  def getAscendant(reference: java.lang.String): node = js.native
  def getAscendant(reference: java.lang.String, includeSelf: scala.Boolean): node = js.native
  def getCommonAncestor(node: node): scala.Unit = js.native
  def getDocument(): document = js.native
  def getIndex(): scala.Double = js.native
  def getIndex(normalized: scala.Boolean): scala.Double = js.native
  def getNext(): node = js.native
  def getNext(evaluator: js.Function1[/* node */ this.type, scala.Boolean]): node = js.native
  def getNextSourceNode(): node = js.native
  def getNextSourceNode(startFromSibling: scala.Boolean): node = js.native
  def getNextSourceNode(startFromSibling: scala.Boolean, nodeType: scala.Double): node = js.native
  def getNextSourceNode(startFromSibling: scala.Boolean, nodeType: scala.Double, guard: node): node = js.native
  def getNextSourceNode(
    startFromSibling: scala.Boolean,
    nodeType: scala.Double,
    guard: js.Function1[/* node */ this.type, scala.Boolean]
  ): node = js.native
  def getParent(): element = js.native
  def getParent(allowFragmentParent: scala.Boolean): element = js.native
  def getParents(): js.Array[node] = js.native
  def getParents(closerFirst: scala.Boolean): js.Array[node] = js.native
  def getPosition(otherNode: node): scala.Unit = js.native
  def getPrevious(): node = js.native
  def getPrevious(evaluator: js.Function1[/* node */ this.type, scala.Boolean]): node = js.native
  def getPreviousSourceNode(): node = js.native
  def getPreviousSourceNode(startFromSibling: scala.Boolean): node = js.native
  def getPreviousSourceNode(startFromSibling: scala.Boolean, nodeType: scala.Double): node = js.native
  def getPreviousSourceNode(startFromSibling: scala.Boolean, nodeType: scala.Double, guard: node): node = js.native
  def getPreviousSourceNode(
    startFromSibling: scala.Boolean,
    nodeType: scala.Double,
    guard: js.Function1[/* node */ this.type, scala.Boolean]
  ): node = js.native
  def hasAscendant(name: java.lang.String, includeSelf: scala.Boolean): scala.Boolean = js.native
  def hasNext(): scala.Boolean = js.native
  def hasPrevious(): scala.Boolean = js.native
  def insertAfter(node: node): node = js.native
  def insertBefore(node: node): node = js.native
  def insertBeforeMe(node: node): node = js.native
  def isReadOnly(): scala.Boolean = js.native
  def ltrim(): scala.Unit = js.native
  def remove(): node = js.native
  def remove(preserveChildren: scala.Boolean): node = js.native
  def replace(nodeToReplace: node): scala.Unit = js.native
  def rtrim(): scala.Unit = js.native
  def trim(): scala.Unit = js.native
}

