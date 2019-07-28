package typings.ckeditor.CKEDITORNs.pluginsNs.notificationAggregatorNs

import typings.ckeditor.CKEDITORNs.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notificationAggregator.task")
@js.native
class task () extends event {
  def this(weight: Double) = this()
  def cancel(): Unit = js.native
  def done(): Unit = js.native
  def isCanceled(): Boolean = js.native
  def isDone(): Boolean = js.native
  def update(weight: Double): Unit = js.native
}

