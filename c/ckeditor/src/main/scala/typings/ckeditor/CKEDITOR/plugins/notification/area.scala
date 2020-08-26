package typings.ckeditor.CKEDITOR.plugins.notification

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait area extends js.Object {
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  val notifications: js.Array[typings.ckeditor.CKEDITOR.plugins.notification] = js.native
  def add(notification: typings.ckeditor.CKEDITOR.plugins.notification): Unit = js.native
  def remove(notification: typings.ckeditor.CKEDITOR.plugins.notification): Unit = js.native
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
  @scala.inline
  implicit class areaOps[Self <: area] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: typings.ckeditor.CKEDITOR.plugins.notification => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setEditor(value: editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotificationsVarargs(value: typings.ckeditor.CKEDITOR.plugins.notification*): Self = this.set("notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: js.Array[typings.ckeditor.CKEDITOR.plugins.notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: typings.ckeditor.CKEDITOR.plugins.notification => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

