package typings.daterangepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  /**
    * Text for apply label.
    */
  var applyLabel: js.UndefOr[String] = js.native
  
  /**
    * Text for cancel label.
    */
  var cancelLabel: js.UndefOr[String] = js.native
  
  /**
    * Text for the custom range label.
    */
  var customRangeLabel: js.UndefOr[String] = js.native
  
  /**
    * Weekday names displayed in the header of calendar.
    */
  var daysOfWeek: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The first day of the week (0-6, Sunday to Saturday).
    */
  var firstDay: js.UndefOr[Double] = js.native
  
  /**
    * Format of the date string. example: 'YYYY-MM-DD'
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Text for fromLabel label.
    */
  var fromLabel: js.UndefOr[String] = js.native
  
  /**
    * Month names used in the month select boxes.
    */
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Separator between the startDate and endDate in the attached input element. Example: ' - '
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    * Text for toLabel label.
    */
  var toLabel: js.UndefOr[String] = js.native
  
  /**
    * Text for the week label.
    */
  var weekLabel: js.UndefOr[String] = js.native
}
object Locale {
  
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setApplyLabel(value: String): Self = this.set("applyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyLabel: Self = this.set("applyLabel", js.undefined)
    
    @scala.inline
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelLabel: Self = this.set("cancelLabel", js.undefined)
    
    @scala.inline
    def setCustomRangeLabel(value: String): Self = this.set("customRangeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRangeLabel: Self = this.set("customRangeLabel", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: String*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeek: Self = this.set("daysOfWeek", js.undefined)
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstDay: Self = this.set("firstDay", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFromLabel(value: String): Self = this.set("fromLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromLabel: Self = this.set("fromLabel", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setToLabel(value: String): Self = this.set("toLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToLabel: Self = this.set("toLabel", js.undefined)
    
    @scala.inline
    def setWeekLabel(value: String): Self = this.set("weekLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekLabel: Self = this.set("weekLabel", js.undefined)
  }
}
