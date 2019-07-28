package typings.bootstrapDashDatepicker

import typings.jquery.JQueryEventObject
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerEventObject extends JQueryEventObject {
  var date: Date = js.native
  var dates: js.Array[Date] = js.native
  def format(): String = js.native
  def format(format: String): String = js.native
  def format(ix: Double): String = js.native
  def format(ix: Double, format: String): String = js.native
}

