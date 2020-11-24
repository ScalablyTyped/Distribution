package typings.awsSdk.timestreamwriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends js.Object {
  
  /**
    * Contains the list of dimensions for time series data points.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.timestreamwriteMod.Dimensions] = js.native
  
  /**
    * Measure represents the data attribute of the time series. For example, the CPU utilization of an EC2 instance or the RPM of a wind turbine are measures. 
    */
  var MeasureName: js.UndefOr[StringValue256] = js.native
  
  /**
    *  Contains the measure value for the time series data point. 
    */
  var MeasureValue: js.UndefOr[StringValue2048] = js.native
  
  /**
    *  Contains the data type of the measure value for the time series data point. 
    */
  var MeasureValueType: js.UndefOr[typings.awsSdk.timestreamwriteMod.MeasureValueType] = js.native
  
  /**
    *  Contains the time at which the measure value for the data point was collected. 
    */
  var Time: js.UndefOr[StringValue256] = js.native
  
  /**
    *  The granularity of the timestamp unit. It indicates if the time value is in seconds, milliseconds, nanoseconds or other supported values. 
    */
  var TimeUnit: js.UndefOr[typings.awsSdk.timestreamwriteMod.TimeUnit] = js.native
}
object Record {
  
  @scala.inline
  def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setDimensionsVarargs(value: Dimension*): Self = this.set("Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setMeasureName(value: StringValue256): Self = this.set("MeasureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureName: Self = this.set("MeasureName", js.undefined)
    
    @scala.inline
    def setMeasureValue(value: StringValue2048): Self = this.set("MeasureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureValue: Self = this.set("MeasureValue", js.undefined)
    
    @scala.inline
    def setMeasureValueType(value: MeasureValueType): Self = this.set("MeasureValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureValueType: Self = this.set("MeasureValueType", js.undefined)
    
    @scala.inline
    def setTime(value: StringValue256): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("Time", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: TimeUnit): Self = this.set("TimeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUnit: Self = this.set("TimeUnit", js.undefined)
  }
}
