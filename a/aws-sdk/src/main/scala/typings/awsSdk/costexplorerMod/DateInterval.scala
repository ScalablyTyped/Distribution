package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateInterval extends js.Object {
  
  /**
    * The end of the time period that you want the usage and costs for. The end date is exclusive. For example, if end is 2017-05-01, AWS retrieves cost and usage data from the start date up to, but not including, 2017-05-01.
    */
  var End: YearMonthDay = js.native
  
  /**
    * The beginning of the time period that you want the usage and costs for. The start date is inclusive. For example, if start is 2017-01-01, AWS retrieves cost and usage data starting at 2017-01-01 up to the end date.
    */
  var Start: YearMonthDay = js.native
}
object DateInterval {
  
  @scala.inline
  def apply(End: YearMonthDay, Start: YearMonthDay): DateInterval = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInterval]
  }
  
  @scala.inline
  implicit class DateIntervalOps[Self <: DateInterval] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: YearMonthDay): Self = this.set("End", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: YearMonthDay): Self = this.set("Start", value.asInstanceOf[js.Any])
  }
}
