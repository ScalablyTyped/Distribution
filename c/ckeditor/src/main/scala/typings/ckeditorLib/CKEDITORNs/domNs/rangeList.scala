package typings
package ckeditorLib.CKEDITORNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.rangeList")
@js.native
class rangeList () extends js.Object {
  def this(ranges: range) = this()
  def this(ranges: js.Array[range]) = this()
  def createBokmarks(): js.Array[bookmark] = js.native
  def createBokmarks(serializable: scala.Boolean): js.Array[bookmark] = js.native
  def createBookmarks2(): js.Array[bookmark2] = js.native
  def createBookmarks2(normalized: scala.Boolean): js.Array[bookmark2] = js.native
  def createIterator(): rangeListIterator = js.native
  def moveToBookmarks(bookmarks: js.Array[bookmark]): scala.Unit = js.native
}

