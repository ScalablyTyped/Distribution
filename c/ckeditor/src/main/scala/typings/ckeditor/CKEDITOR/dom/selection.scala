package typings.ckeditor.CKEDITOR.dom

import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
@JSGlobal("CKEDITOR.dom.selection")
@js.native
class selection protected () extends js.Object {
  def this(target: typings.ckeditor.CKEDITOR.dom.document) = this()
  def this(target: element) = this()
  def this(target: selection) = this()
  val FILLING_CHAR_SEQUENCE: String = js.native
  val document: typings.ckeditor.CKEDITOR.dom.document = js.native
  val isFake: Boolean = js.native
  val isLocked: Boolean = js.native
  val rev: Double = js.native
  val root: element = js.native
  def createBookmarks(serializable: js.Any): js.Array[bookmark] = js.native
  def createBookmarks2(normalized: js.Any): js.Array[bookmark2] = js.native
  def fake(element: element): Unit = js.native
  def fake(element: element, ariaLabel: Boolean): Unit = js.native
  def getCommonAncestor(): element = js.native
  def getNative(): Selection = js.native
  def getRanges(): js.Array[range] = js.native
  def getRanges(onlyEditables: Boolean): js.Array[range] = js.native
  def getSelectedElement(): element = js.native
  def getSelectedText(): String = js.native
  def getStartElement(): element = js.native
  def getType(): Double = js.native
  def isCollapsed(): Boolean = js.native
  def isHidden(): Boolean = js.native
  def isInTable(): Boolean = js.native
  def isInTable(allowPartialSelection: Boolean): Boolean = js.native
  def lock(): Unit = js.native
  def removeAllRanges(): Unit = js.native
  def reset(): Unit = js.native
  def scrollIntoView(): Unit = js.native
  def selectBookmarks(bookmarks: js.Array[bookmark | bookmark2]): selection = js.native
  def selectElement(element: element): Unit = js.native
  def selectRanges(ranges: js.Array[range]): Unit = js.native
  def unlock(restore: Boolean): Unit = js.native
}

