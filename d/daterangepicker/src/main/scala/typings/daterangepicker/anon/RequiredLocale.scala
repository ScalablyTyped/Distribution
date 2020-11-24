package typings.daterangepicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<daterangepicker.daterangepicker.Locale> */
@js.native
trait RequiredLocale extends js.Object {
  
  var applyLabel: String = js.native
  
  var cancelLabel: String = js.native
  
  var customRangeLabel: String = js.native
  
  var daysOfWeek: js.Array[String] = js.native
  
  var firstDay: Double = js.native
  
  var format: String = js.native
  
  var fromLabel: String = js.native
  
  var monthNames: js.Array[String] = js.native
  
  var separator: String = js.native
  
  var toLabel: String = js.native
  
  var weekLabel: String = js.native
}
object RequiredLocale {
  
  @scala.inline
  def apply(
    applyLabel: String,
    cancelLabel: String,
    customRangeLabel: String,
    daysOfWeek: js.Array[String],
    firstDay: Double,
    format: String,
    fromLabel: String,
    monthNames: js.Array[String],
    separator: String,
    toLabel: String,
    weekLabel: String
  ): RequiredLocale = {
    val __obj = js.Dynamic.literal(applyLabel = applyLabel.asInstanceOf[js.Any], cancelLabel = cancelLabel.asInstanceOf[js.Any], customRangeLabel = customRangeLabel.asInstanceOf[js.Any], daysOfWeek = daysOfWeek.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], fromLabel = fromLabel.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], toLabel = toLabel.asInstanceOf[js.Any], weekLabel = weekLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredLocale]
  }
  
  @scala.inline
  implicit class RequiredLocaleOps[Self <: RequiredLocale] (val x: Self) extends AnyVal {
    
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
    def setCancelLabel(value: String): Self = this.set("cancelLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomRangeLabel(value: String): Self = this.set("customRangeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekVarargs(value: String*): Self = this.set("daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeek(value: js.Array[String]): Self = this.set("daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromLabel(value: String): Self = this.set("fromLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLabel(value: String): Self = this.set("toLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekLabel(value: String): Self = this.set("weekLabel", value.asInstanceOf[js.Any])
  }
}
