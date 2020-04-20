package typings.ckeditor.CKEDITOR.plugins.notification

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait area extends js.Object {
  val editor: typings.ckeditor.CKEDITOR.editor
  val element: typings.ckeditor.CKEDITOR.dom.element
  val notifications: js.Array[typings.ckeditor.CKEDITOR.plugins.notification]
  def add(notification: typings.ckeditor.CKEDITOR.plugins.notification): Unit
  def remove(notification: typings.ckeditor.CKEDITOR.plugins.notification): Unit
}

object area {
  @scala.inline
  def apply(
    add: typings.ckeditor.CKEDITOR.plugins.notification => Unit,
    editor: editor,
    element: element,
    notifications: js.Array[typings.ckeditor.CKEDITOR.plugins.notification],
    remove: typings.ckeditor.CKEDITOR.plugins.notification => Unit
  ): area = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[area]
  }
}

