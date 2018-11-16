package typings
package ckeditorLib.CKEDITORNs.pluginsNs.notificationAggregatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.notificationAggregator.task")
@js.native
class task ()
  extends ckeditorLib.CKEDITORNs.event {
  def this(weight: scala.Double) = this()
  def cancel(): scala.Unit = js.native
  def done(): scala.Unit = js.native
  def isCanceled(): scala.Boolean = js.native
  def isDone(): scala.Boolean = js.native
  def update(weight: scala.Double): scala.Unit = js.native
}

