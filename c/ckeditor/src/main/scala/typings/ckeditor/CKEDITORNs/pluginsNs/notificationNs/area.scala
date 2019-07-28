package typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs

import typings.ckeditor.CKEDITORNs.domNs.element
import typings.ckeditor.CKEDITORNs.editor
import typings.ckeditor.CKEDITORNs.pluginsNs.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait area extends js.Object {
  val editor: typings.ckeditor.CKEDITORNs.editor
  val element: typings.ckeditor.CKEDITORNs.domNs.element
  val notifications: js.Array[notification]
  def add(notification: notification): Unit
  def remove(notification: notification): Unit
}

object area {
  @scala.inline
  def apply(
    add: notification => Unit,
    editor: editor,
    element: element,
    notifications: js.Array[notification],
    remove: notification => Unit
  ): area = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), editor = editor, element = element, notifications = notifications, remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[area]
  }
}

