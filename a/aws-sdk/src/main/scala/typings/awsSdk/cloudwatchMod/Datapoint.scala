package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datapoint extends StObject {
  
  /**
    * The average of the metric values that correspond to the data point.
    */
  var Average: js.UndefOr[DatapointValue] = js.undefined
  
  /**
    * The percentile statistic for the data point.
    */
  var ExtendedStatistics: js.UndefOr[DatapointValueMap] = js.undefined
  
  /**
    * The maximum metric value for the data point.
    */
  var Maximum: js.UndefOr[DatapointValue] = js.undefined
  
  /**
    * The minimum metric value for the data point.
    */
  var Minimum: js.UndefOr[DatapointValue] = js.undefined
  
  /**
    * The number of metric values that contributed to the aggregate value of this data point.
    */
  var SampleCount: js.UndefOr[DatapointValue] = js.undefined
  
  /**
    * The sum of the metric values for the data point.
    */
  var Sum: js.UndefOr[DatapointValue] = js.undefined
  
  /**
    * The time stamp used for the data point.
    */
  var Timestamp: js.UndefOr[typings.awsSdk.cloudwatchMod.Timestamp] = js.undefined
  
  /**
    * The standard unit for the data point.
    */
  var Unit: js.UndefOr[StandardUnit] = js.undefined
}
object Datapoint {
  
  @scala.inline
  def apply(): Datapoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datapoint]
  }
  
  @scala.inline
  implicit class DatapointMutableBuilder[Self <: Datapoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: DatapointValue): Self = StObject.set(x, "Average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "Average", js.undefined)
    
    @scala.inline
    def setExtendedStatistics(value: DatapointValueMap): Self = StObject.set(x, "ExtendedStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedStatisticsUndefined: Self = StObject.set(x, "ExtendedStatistics", js.undefined)
    
    @scala.inline
    def setMaximum(value: DatapointValue): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "Maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: DatapointValue): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "Minimum", js.undefined)
    
    @scala.inline
    def setSampleCount(value: DatapointValue): Self = StObject.set(x, "SampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleCountUndefined: Self = StObject.set(x, "SampleCount", js.undefined)
    
    @scala.inline
    def setSum(value: DatapointValue): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setUnit(value: StandardUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
