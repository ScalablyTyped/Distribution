package typings
package ckeditorLib.CKEDITORNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
class notificationAggregator protected ()
  extends ckeditorLib.CKEDITORNs.event {
  def this(editor: ckeditorLib.CKEDITORNs.editor, message: java.lang.String) = this()
  def this(editor: ckeditorLib.CKEDITORNs.editor, message: java.lang.String, singularMessage: java.lang.String) = this()
  val editor: ckeditorLib.CKEDITORNs.editor = js.native
  val notification: ckeditorLib.CKEDITORNs.pluginsNs.notification = js.native
  def createTask(): ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs.task = js.native
  def createTask(options: ckeditorLib.Anon_Weight): ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs.task = js.native
  def getDoneTaskCount(): scala.Double = js.native
  def getPercentage(): scala.Double = js.native
  def getTaskCount(): scala.Double = js.native
  def isFinished(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

