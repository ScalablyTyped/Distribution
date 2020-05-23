package typings.ckeditor.CKEDITOR.ui.panel

import typings.ckeditor.CKEDITOR.dom.nodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait block extends js.Object {
  def getItems(): nodeList
  def markItem(index: Double): Unit
}

object block {
  @scala.inline
  def apply(getItems: () => nodeList, markItem: Double => Unit): block = {
    val __obj = js.Dynamic.literal(getItems = js.Any.fromFunction0(getItems), markItem = js.Any.fromFunction1(markItem))
    __obj.asInstanceOf[block]
  }
}

