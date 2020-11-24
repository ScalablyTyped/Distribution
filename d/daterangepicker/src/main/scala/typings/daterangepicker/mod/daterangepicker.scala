package typings.daterangepicker.mod

import typings.daterangepicker.mod.global.JQuery
import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait daterangepicker extends js.Object {
  
  var container: JQuery = js.native
  
  var endDate: Moment = js.native
  
  def remove(): Unit = js.native
  
  def setEndDate(date: DateOrString): Unit = js.native
  
  def setStartDate(date: DateOrString): Unit = js.native
  
  var startDate: Moment = js.native
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
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setEndDate = js.Any.fromFunction1(setEndDate), setStartDate = js.Any.fromFunction1(setStartDate), startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[daterangepicker]
  }
  
  @scala.inline
  implicit class daterangepickerOps[Self <: daterangepicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainer(value: JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: Moment): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEndDate(value: DateOrString => Unit): Self = this.set("setEndDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartDate(value: DateOrString => Unit): Self = this.set("setStartDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDate(value: Moment): Self = this.set("startDate", value.asInstanceOf[js.Any])
  }
}
