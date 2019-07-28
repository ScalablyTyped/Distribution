package typings.daterangepicker.daterangepickerMod

import typings.daterangepicker.daterangepickerMod.Global.JQuery
import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait daterangepicker extends js.Object {
  var container: JQuery
  var endDate: Moment
  var startDate: Moment
  def remove(): Unit
  def setEndDate(date: DateOrString): Unit
  def setStartDate(date: DateOrString): Unit
}

object daterangepicker {
  @scala.inline
  def apply(
    container: JQuery,
    endDate: Moment,
    remove: () => Unit,
    setEndDate: DateOrString => Unit,
    setStartDate: DateOrString => Unit,
    startDate: Moment
  ): daterangepicker = {
    val __obj = js.Dynamic.literal(container = container, endDate = endDate, remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate)
  
    __obj.asInstanceOf[daterangepicker]
  }
}

