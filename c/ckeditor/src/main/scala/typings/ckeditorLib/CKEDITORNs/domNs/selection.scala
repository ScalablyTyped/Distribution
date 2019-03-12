package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://docs.com/ckeditor4/latest/api/CKEDITOR_dom_selection.html
@JSGlobal("CKEDITOR.dom.selection")
@js.native
class selection protected () extends js.Object {
  def this(target: document) = this()
  def this(target: element) = this()
  def this(target: selection) = this()
  val FILLING_CHAR_SEQUENCE: java.lang.String = js.native
  val document: ckeditorLib.CKEDITORNs.domNs.document = js.native
  val isFake: scala.Boolean = js.native
  val isLocked: scala.Boolean = js.native
  val rev: scala.Double = js.native
  val root: element = js.native
  def createBookmarks(serializable: js.Any): js.Array[bookmark] = js.native
  def createBookmarks2(normalized: js.Any): js.Array[bookmark2] = js.native
  def fake(element: element): scala.Unit = js.native
  def fake(element: element, ariaLabel: scala.Boolean): scala.Unit = js.native
  def getCommonAncestor(): element = js.native
  def getNative(): stdLib.Selection = js.native
  def getRanges(): js.Array[range] = js.native
  def getRanges(onlyEditables: scala.Boolean): js.Array[range] = js.native
  def getSelectedElement(): element = js.native
  def getSelectedText(): java.lang.String = js.native
  def getStartElement(): element = js.native
  def getType(): scala.Double = js.native
  def isCollapsed(): scala.Boolean = js.native
  def isHidden(): scala.Boolean = js.native
  def isInTable(): scala.Boolean = js.native
  def isInTable(allowPartialSelection: scala.Boolean): scala.Boolean = js.native
  def lock(): scala.Unit = js.native
  def removeAllRanges(): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def selectBookmarks(bookmarks: js.Array[bookmark | bookmark2]): selection = js.native
  def selectElement(element: element): scala.Unit = js.native
  def selectRanges(ranges: js.Array[range]): scala.Unit = js.native
  def unlock(restore: scala.Boolean): scala.Unit = js.native
}

