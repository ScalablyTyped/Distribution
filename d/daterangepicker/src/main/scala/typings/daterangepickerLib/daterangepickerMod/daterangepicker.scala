package typings
package daterangepickerLib.daterangepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait daterangepicker extends js.Object {
  var container: daterangepickerLib.daterangepickerMod.Global.JQuery
  var endDate: momentLib.momentMod.momentNs.Moment
  var startDate: momentLib.momentMod.momentNs.Moment
  def remove(): scala.Unit
  def setEndDate(date: daterangepickerLib.daterangepickerMod.daterangepickerNs.DateOrString): scala.Unit
  def setStartDate(date: daterangepickerLib.daterangepickerMod.daterangepickerNs.DateOrString): scala.Unit
}

