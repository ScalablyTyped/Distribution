package typings
package daterangepickerLib.daterangepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait daterangepicker extends js.Object {
  var container: daterangepickerLib.daterangepickerMod.Global.JQuery
  var endDate: momentLib.momentMod.Moment
  var startDate: momentLib.momentMod.Moment
  def remove(): scala.Unit
  def setEndDate(date: DateOrString): scala.Unit
  def setStartDate(date: DateOrString): scala.Unit
}

object daterangepicker {
  @scala.inline
  def apply(
    container: daterangepickerLib.daterangepickerMod.Global.JQuery,
    endDate: momentLib.momentMod.Moment,
    remove: () => scala.Unit,
    setEndDate: DateOrString => scala.Unit,
    setStartDate: DateOrString => scala.Unit,
    startDate: momentLib.momentMod.Moment
  ): daterangepicker = {
    val __obj = js.Dynamic.literal(container = container, endDate = endDate, remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate)
  
    __obj.asInstanceOf[daterangepicker]
  }
}

