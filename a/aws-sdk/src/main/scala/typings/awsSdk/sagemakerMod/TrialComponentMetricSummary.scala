package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialComponentMetricSummary extends StObject {
  
  /**
    * The average value of the metric.
    */
  var Avg: js.UndefOr[OptionalDouble] = js.undefined
  
  /**
    * The number of samples used to generate the metric.
    */
  var Count: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * The most recent value of the metric.
    */
  var Last: js.UndefOr[OptionalDouble] = js.undefined
  
  /**
    * The maximum value of the metric.
    */
  var Max: js.UndefOr[OptionalDouble] = js.undefined
  
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.sagemakerMod.MetricName] = js.undefined
  
  /**
    * The minimum value of the metric.
    */
  var Min: js.UndefOr[OptionalDouble] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source.
    */
  var SourceArn: js.UndefOr[TrialComponentSourceArn] = js.undefined
  
  /**
    * The standard deviation of the metric.
    */
  var StdDev: js.UndefOr[OptionalDouble] = js.undefined
  
  /**
    * When the metric was last updated.
    */
  var TimeStamp: js.UndefOr[Timestamp] = js.undefined
}
object TrialComponentMetricSummary {
  
  @scala.inline
  def apply(): TrialComponentMetricSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentMetricSummary]
  }
  
  @scala.inline
  implicit class TrialComponentMetricSummaryMutableBuilder[Self <: TrialComponentMetricSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvg(value: OptionalDouble): Self = StObject.set(x, "Avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgUndefined: Self = StObject.set(x, "Avg", js.undefined)
    
    @scala.inline
    def setCount(value: OptionalInteger): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setLast(value: OptionalDouble): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUndefined: Self = StObject.set(x, "Last", js.undefined)
    
    @scala.inline
    def setMax(value: OptionalDouble): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    @scala.inline
    def setMin(value: OptionalDouble): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
    
    @scala.inline
    def setSourceArn(value: TrialComponentSourceArn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    @scala.inline
    def setStdDev(value: OptionalDouble): Self = StObject.set(x, "StdDev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdDevUndefined: Self = StObject.set(x, "StdDev", js.undefined)
    
    @scala.inline
    def setTimeStamp(value: Timestamp): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStampUndefined: Self = StObject.set(x, "TimeStamp", js.undefined)
  }
}
