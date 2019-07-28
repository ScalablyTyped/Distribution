package typings.ckeditor.CKEDITORNs.pluginsNs

import typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs.options
import typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs.updateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notification")
@js.native
class notification protected () extends js.Object {
  def this(editor: typings.ckeditor.CKEDITORNs.editor, options: options) = this()
  val area: typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs.area = js.native
  val duration: Double = js.native
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val element: typings.ckeditor.CKEDITORNs.domNs.element = js.native
  val id: Double = js.native
  val message: String = js.native
  val progress: Double = js.native
  val `type`: typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs.`type` = js.native
  def hide(): Unit = js.native
  def isVisible(): Boolean = js.native
  def show(): Unit = js.native
  def update(options: updateOptions): Unit = js.native
}

