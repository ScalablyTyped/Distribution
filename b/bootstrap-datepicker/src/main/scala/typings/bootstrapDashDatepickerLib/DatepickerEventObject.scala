package typings
package bootstrapDashDatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatepickerEventObject
  extends jqueryLib.JQueryEventObject {
  var date: stdLib.Date = js.native
  var dates: js.Array[stdLib.Date] = js.native
  def format(): java.lang.String = js.native
  def format(format: java.lang.String): java.lang.String = js.native
  def format(ix: scala.Double): java.lang.String = js.native
  def format(ix: scala.Double, format: java.lang.String): java.lang.String = js.native
}

