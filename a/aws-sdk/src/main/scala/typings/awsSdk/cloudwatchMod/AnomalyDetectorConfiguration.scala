package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyDetectorConfiguration extends StObject {
  
  /**
    * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch creates the model.
    */
  var ExcludedTimeRanges: js.UndefOr[AnomalyDetectorExcludedTimeRanges] = js.native
  
  /**
    * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight savings time changes if the metric is sensitive to such time changes. To specify a time zone, use the name of the time zone as specified in the standard tz database. For more information, see tz database.
    */
  var MetricTimezone: js.UndefOr[AnomalyDetectorMetricTimezone] = js.native
}
object AnomalyDetectorConfiguration {
  
  @scala.inline
  def apply(): AnomalyDetectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnomalyDetectorConfiguration]
  }
  
  @scala.inline
  implicit class AnomalyDetectorConfigurationMutableBuilder[Self <: AnomalyDetectorConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedTimeRanges(value: AnomalyDetectorExcludedTimeRanges): Self = StObject.set(x, "ExcludedTimeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTimeRangesUndefined: Self = StObject.set(x, "ExcludedTimeRanges", js.undefined)
    
    @scala.inline
    def setExcludedTimeRangesVarargs(value: Range*): Self = StObject.set(x, "ExcludedTimeRanges", js.Array(value :_*))
    
    @scala.inline
    def setMetricTimezone(value: AnomalyDetectorMetricTimezone): Self = StObject.set(x, "MetricTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricTimezoneUndefined: Self = StObject.set(x, "MetricTimezone", js.undefined)
  }
}
