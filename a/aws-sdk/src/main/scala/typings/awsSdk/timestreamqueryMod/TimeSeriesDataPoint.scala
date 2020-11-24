package typings.awsSdk.timestreamqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesDataPoint extends js.Object {
  
  /**
    * The timestamp when the measure value was collected.
    */
  var Time: Timestamp = js.native
  
  /**
    * The measure value for the data point.
    */
  var Value: Datum = js.native
}
object TimeSeriesDataPoint {
  
  @scala.inline
  def apply(Time: Timestamp, Value: Datum): TimeSeriesDataPoint = {
    val __obj = js.Dynamic.literal(Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSeriesDataPoint]
  }
  
  @scala.inline
  implicit class TimeSeriesDataPointOps[Self <: TimeSeriesDataPoint] (val x: Self) extends AnyVal {
    
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
    def setTime(value: Timestamp): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Datum): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
