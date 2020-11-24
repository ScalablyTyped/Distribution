package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rangeList extends js.Object {
  
  def createBokmarks(): js.Array[bookmark] = js.native
  def createBokmarks(serializable: Boolean): js.Array[bookmark] = js.native
  
  def createBookmarks2(): js.Array[bookmark2] = js.native
  def createBookmarks2(normalized: Boolean): js.Array[bookmark2] = js.native
  
  def createIterator(): rangeListIterator = js.native
  
  def moveToBookmarks(bookmarks: js.Array[bookmark]): Unit = js.native
}
