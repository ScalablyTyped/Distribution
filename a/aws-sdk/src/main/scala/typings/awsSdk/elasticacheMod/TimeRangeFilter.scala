package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRangeFilter extends StObject {
  
  /**
    * The end time of the time range filter
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The start time of the time range filter
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
}
object TimeRangeFilter {
  
  @scala.inline
  def apply(): TimeRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeRangeFilter]
  }
  
  @scala.inline
  implicit class TimeRangeFilterMutableBuilder[Self <: TimeRangeFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: TStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
