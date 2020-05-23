package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.plugins.notification.`type`
import typings.ckeditor.CKEDITOR.plugins.notification.area
import typings.ckeditor.CKEDITOR.plugins.notification.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait notification_ extends js.Object {
  val area: typings.ckeditor.CKEDITOR.plugins.notification.area
  val duration: Double
  val editor: typings.ckeditor.CKEDITOR.editor
  val element: typings.ckeditor.CKEDITOR.dom.element
  val id: Double
  val message: String
  val progress: Double
  val `type`: typings.ckeditor.CKEDITOR.plugins.notification.`type`
  def hide(): Unit
  def isVisible(): Boolean
  def show(): Unit
  def update(options: updateOptions): Unit
}

object notification_ {
  @scala.inline
  def apply(
    area: area,
    duration: Double,
    editor: editor,
    element: element,
    hide: () => Unit,
    id: Double,
    isVisible: () => Boolean,
    message: String,
    progress: Double,
    show: () => Unit,
    `type`: `type`,
    update: updateOptions => Unit
  ): notification_ = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), id = id.asInstanceOf[js.Any], isVisible = js.Any.fromFunction0(isVisible), message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[notification_]
  }
}

