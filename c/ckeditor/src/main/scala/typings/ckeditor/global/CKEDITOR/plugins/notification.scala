package typings.ckeditor.global.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.plugins.notification.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notification")
@js.native
class notification protected ()
  extends typings.ckeditor.CKEDITOR.plugins.notification {
  def this(
    editor: typings.ckeditor.CKEDITOR.editor,
    options: typings.ckeditor.CKEDITOR.plugins.notification.options
  ) = this()
  /* CompleteClass */
  override val area: typings.ckeditor.CKEDITOR.plugins.notification.area = js.native
  /* CompleteClass */
  override val duration: Double = js.native
  /* CompleteClass */
  override val editor: typings.ckeditor.CKEDITOR.editor = js.native
  /* CompleteClass */
  override val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  /* CompleteClass */
  override val id: Double = js.native
  /* CompleteClass */
  override val message: String = js.native
  /* CompleteClass */
  override val progress: Double = js.native
  /* CompleteClass */
  override val `type`: typings.ckeditor.CKEDITOR.plugins.notification.`type` = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def isVisible(): Boolean = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  /* CompleteClass */
  override def update(options: updateOptions): Unit = js.native
}

