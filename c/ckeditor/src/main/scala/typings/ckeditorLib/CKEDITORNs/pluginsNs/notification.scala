package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notification")
@js.native
class notification protected () extends js.Object {
  def this(editor: ckeditorLib.CKEDITORNs.editor, options: ckeditorLib.CKEDITORNs.pluginsNs.notificationNs.options) = this()
  val area: ckeditorLib.CKEDITORNs.pluginsNs.notificationNs.area = js.native
  val duration: scala.Double = js.native
  val editor: ckeditorLib.CKEDITORNs.editor = js.native
  val element: ckeditorLib.CKEDITORNs.domNs.element = js.native
  val id: scala.Double = js.native
  val message: java.lang.String = js.native
  val progress: scala.Double = js.native
  val `type`: ckeditorLib.CKEDITORNs.pluginsNs.notificationNs.`type` = js.native
  def hide(): scala.Unit = js.native
  def isVisible(): scala.Boolean = js.native
  def show(): scala.Unit = js.native
  def update(options: ckeditorLib.CKEDITORNs.pluginsNs.notificationNs.updateOptions): scala.Unit = js.native
}

