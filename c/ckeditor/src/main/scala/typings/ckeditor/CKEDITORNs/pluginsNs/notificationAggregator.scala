package typings.ckeditor.CKEDITORNs.pluginsNs

import typings.ckeditor.Anon_Weight
import typings.ckeditor.CKEDITORNs.event
import typings.ckeditor.CKEDITORNs.pluginsNs.notificationAggregatorNs.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notificationAggregator")
@js.native
class notificationAggregator protected () extends event {
  def this(editor: typings.ckeditor.CKEDITORNs.editor, message: String) = this()
  def this(editor: typings.ckeditor.CKEDITORNs.editor, message: String, singularMessage: String) = this()
  val editor: typings.ckeditor.CKEDITORNs.editor = js.native
  val notification: typings.ckeditor.CKEDITORNs.pluginsNs.notification = js.native
  def createTask(): task = js.native
  def createTask(options: Anon_Weight): task = js.native
  def getDoneTaskCount(): Double = js.native
  def getPercentage(): Double = js.native
  def getTaskCount(): Double = js.native
  def isFinished(): Boolean = js.native
  def update(): Unit = js.native
}

