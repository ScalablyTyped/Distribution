package typings.clndr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDayEvents extends js.Object {
  
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * If you also have single day events with a different date field,
    * use the singleDay property and point it to the date field.
    */
  var singleDay: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[String] = js.native
}
object MultiDayEvents {
  
  @scala.inline
  def apply(): MultiDayEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiDayEvents]
  }
  
  @scala.inline
  implicit class MultiDayEventsOps[Self <: MultiDayEvents] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setSingleDay(value: String): Self = this.set("singleDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleDay: Self = this.set("singleDay", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
