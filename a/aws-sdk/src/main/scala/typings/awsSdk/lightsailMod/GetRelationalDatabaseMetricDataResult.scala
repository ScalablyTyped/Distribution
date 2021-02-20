package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseMetricDataResult extends StObject {
  
  /**
    * An array of objects that describe the metric data returned.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  
  /**
    * The name of the metric returned.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.native
}
object GetRelationalDatabaseMetricDataResult {
  
  @scala.inline
  def apply(): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseMetricDataResultMutableBuilder[Self <: GetRelationalDatabaseMetricDataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricData(value: MetricDatapointList): Self = StObject.set(x, "metricData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricDataUndefined: Self = StObject.set(x, "metricData", js.undefined)
    
    @scala.inline
    def setMetricDataVarargs(value: MetricDatapoint*): Self = StObject.set(x, "metricData", js.Array(value :_*))
    
    @scala.inline
    def setMetricName(value: RelationalDatabaseMetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricNameUndefined: Self = StObject.set(x, "metricName", js.undefined)
  }
}
