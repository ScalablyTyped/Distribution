package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeRangeFilter extends js.Object {
  
  /**
    * The end time of the time range filter
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The start time of the time range filter
    */
  var StartTime: js.UndefOr[TStamp] = js.native
}
object TimeRangeFilter {
  
  @scala.inline
  def apply(): TimeRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRangeFilter]
  }
  
  @scala.inline
  implicit class TimeRangeFilterOps[Self <: TimeRangeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndTime(value: TStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
  }
}
