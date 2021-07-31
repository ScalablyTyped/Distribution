package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionMetricDataResult extends StObject {
  
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.undefined
  
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[DistributionMetricName] = js.undefined
}
object GetDistributionMetricDataResult {
  
  @scala.inline
  def apply(): GetDistributionMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionMetricDataResult]
  }
  
  @scala.inline
  implicit class GetDistributionMetricDataResultMutableBuilder[Self <: GetDistributionMetricDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricData(value: MetricDatapointList): Self = StObject.set(x, "metricData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDataUndefined: Self = StObject.set(x, "metricData", js.undefined)
    
    @scala.inline
    def setMetricDataVarargs(value: MetricDatapoint*): Self = StObject.set(x, "metricData", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: DistributionMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
