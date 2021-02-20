package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectedMetric extends StObject {
  
  /**
    * The name of the projected utilization metric.
    */
  var name: js.UndefOr[MetricName] = js.native
  
  /**
    * The time stamps of the projected utilization metric.
    */
  var timestamps: js.UndefOr[Timestamps] = js.native
  
  /**
    * The values of the projected utilization metrics.
    */
  var values: js.UndefOr[MetricValues] = js.native
}
object ProjectedMetric {
  
  @scala.inline
  def apply(): ProjectedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectedMetric]
  }
  
  @scala.inline
  implicit class ProjectedMetricMutableBuilder[Self <: ProjectedMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Timestamps): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    @scala.inline
    def setTimestampsVarargs(value: Timestamp*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: MetricValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: MetricValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
