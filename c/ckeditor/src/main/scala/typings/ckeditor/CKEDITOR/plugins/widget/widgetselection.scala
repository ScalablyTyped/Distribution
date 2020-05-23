package typings.ckeditor.CKEDITOR.plugins.widget

import typings.ckeditor.CKEDITOR.editable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait widgetselection extends js.Object {
  def addFillers(editable: editable): Boolean
  def removeFillers(editable: editable): Unit
}

object widgetselection {
  @scala.inline
  def apply(addFillers: editable => Boolean, removeFillers: editable => Unit): widgetselection = {
    val __obj = js.Dynamic.literal(addFillers = js.Any.fromFunction1(addFillers), removeFillers = js.Any.fromFunction1(removeFillers))
    __obj.asInstanceOf[widgetselection]
  }
}

