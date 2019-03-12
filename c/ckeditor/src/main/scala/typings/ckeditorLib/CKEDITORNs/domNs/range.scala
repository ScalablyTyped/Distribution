package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.range")
@js.native
class range protected () extends js.Object {
  def this(root: document) = this()
  def this(root: element) = this()
  val collapsed: scala.Boolean = js.native
  val document: ckeditorLib.CKEDITORNs.domNs.document = js.native
  val endContainer: element | text = js.native
  val endOffset: scala.Double = js.native
  val root: element = js.native
  val startContainer: element | text = js.native
  val startOffset: scala.Double = js.native
  def checkBoundaryOfElement(element: element, checkType: scala.Double): scala.Boolean = js.native
  def checkEndOfBlock(): scala.Boolean = js.native
  def checkReadOnly(): scala.Boolean = js.native
  def checkStartOfBlock(): scala.Boolean = js.native
  def clone(cloneId: scala.Boolean): range = js.native
  def cloneContents(): documentFragment = js.native
  def collapse(): scala.Boolean = js.native
  def collapse(toStart: scala.Boolean): scala.Boolean = js.native
  def createBookmark(): bookmark = js.native
  def createBookmark(serializable: scala.Boolean): bookmark = js.native
  def createBookmark2(): bookmark2 = js.native
  def createBookmark2(normalized: scala.Boolean): bookmark2 = js.native
  def createIterator(): iterator = js.native
  def deleteContents(): scala.Unit = js.native
  def deleteContents(mergeThen: scala.Boolean): scala.Unit = js.native
  def endPath(): elementPath = js.native
  def enlarge(unit: scala.Double): scala.Unit = js.native
  def enlarge(unit: scala.Double, excludeBrs: scala.Boolean): scala.Unit = js.native
  def extractContents(): documentFragment = js.native
  def extractContents(mergeThen: scala.Boolean): documentFragment = js.native
  def extractContents(mergeThen: scala.Boolean, cloneId: scala.Boolean): documentFragment = js.native
  def fixBlock(isStart: scala.Boolean, blockTag: java.lang.String): element = js.native
  def getBoundaryNodes(): ckeditorLib.Anon_EndNode = js.native
  def getCommonAncestor(): element = js.native
  def getCommonAncestor(includeSelf: scala.Boolean): element = js.native
  def getCommonAncestor(includeSelf: scala.Boolean, ignoreTextNode: scala.Boolean): element = js.native
  def getEnclosedNode(): node = js.native
  def getNextEditableNode(): element | text = js.native
  def getNextNode(): element = js.native
  def getNextNode(evaluator: js.Function1[/* element */ element, scala.Boolean]): element = js.native
  def getNextNode(
    evaluator: js.Function1[/* element */ element, scala.Boolean],
    guard: js.Function1[/* element */ element, scala.Boolean]
  ): element = js.native
  def getNextNode(
    evaluator: js.Function1[/* element */ element, scala.Boolean],
    guard: js.Function1[/* element */ element, scala.Boolean],
    boundary: element
  ): element = js.native
  def getPreviousEditableNode(): element | text = js.native
  def getPreviousNode(): element = js.native
  def getPreviousNode(evaluator: js.Function1[/* element */ element, scala.Boolean]): element = js.native
  def getPreviousNode(
    evaluator: js.Function1[/* element */ element, scala.Boolean],
    guard: js.Function1[/* element */ element, scala.Boolean]
  ): element = js.native
  def getPreviousNode(
    evaluator: js.Function1[/* element */ element, scala.Boolean],
    guard: js.Function1[/* element */ element, scala.Boolean],
    boundary: element
  ): element = js.native
  def getTouchedEndNode(): node = js.native
  def getTouchedStartNode(): node = js.native
  def insertNode(node: node): scala.Unit = js.native
  def moveToBookmark(bookmark: bookmark): scala.Unit = js.native
  def moveToBookmark(bookmark: bookmark2): scala.Unit = js.native
  def moveToClosestEditablePosition(): scala.Boolean = js.native
  def moveToClosestEditablePosition(element: element): scala.Boolean = js.native
  def moveToClosestEditablePosition(element: element, isMoveForward: scala.Boolean): scala.Boolean = js.native
  def moveToElementEditEnd(target: element): scala.Boolean = js.native
  def moveToElementEditStart(target: element): scala.Boolean = js.native
  def moveToElementEditablePosition(element: element, isMoveToEnd: scala.Boolean): scala.Boolean = js.native
  def moveToPosition(node: node, position: scala.Double): scala.Unit = js.native
  def moveToRange(range: range): scala.Unit = js.native
  def optimize(): scala.Unit = js.native
  def optimizeBookmark(): scala.Unit = js.native
  def removeEmptyBlocksAtEnd(atEnd: scala.Boolean): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def select(): selection = js.native
  def selectNodeContents(node: node): scala.Unit = js.native
  def setEnd(endNode: node, endOffset: scala.Double): scala.Unit = js.native
  def setEndAfter(node: node): scala.Unit = js.native
  def setEndAt(node: node, position: scala.Double): scala.Unit = js.native
  def setEndBefore(node: node): scala.Unit = js.native
  def setStart(startNode: node, startOffset: scala.Double): scala.Unit = js.native
  def setStartAfter(node: node): scala.Unit = js.native
  def setStartAt(node: node, position: scala.Double): scala.Unit = js.native
  def setStartBefore(node: node): scala.Unit = js.native
  def shrink(mode: scala.Double): scala.Unit = js.native
  def shrink(mode: scala.Double, selectContents: scala.Boolean): scala.Unit = js.native
  def shrink(mode: scala.Double, selectContents: scala.Boolean, options: shrinkOptions): scala.Unit = js.native
  def shrink(mode: scala.Double, selectContents: scala.Boolean, options: scala.Boolean): scala.Unit = js.native
  def splitBlock(): scala.Unit = js.native
  def splitBlock(cloneId: scala.Boolean): scala.Unit = js.native
  def splitElement(toSplit: element): element = js.native
  def splitElement(toSplit: element, cloneId: scala.Boolean): element = js.native
  def startPath(): elementPath = js.native
  def trim(): scala.Unit = js.native
  def trim(ignoreStart: scala.Boolean): scala.Unit = js.native
  def trim(ignoreStart: scala.Boolean, ignoreEnd: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("CKEDITOR.dom.range")
@js.native
object range extends js.Object {
  def mergeRanges(ranges: js.Array[ckeditorLib.CKEDITORNs.domNs.range]): js.Array[ckeditorLib.CKEDITORNs.domNs.range] = js.native
}

