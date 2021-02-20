package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilizationMetric extends StObject {
  
  /**
    * The name of the utilization metric.  The Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.native
  
  /**
    * The statistic of the utilization metric.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.native
  
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.native
}
object UtilizationMetric {
  
  @scala.inline
  def apply(): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationMetric]
  }
  
  @scala.inline
  implicit class UtilizationMetricMutableBuilder[Self <: UtilizationMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatistic(value: MetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    @scala.inline
    def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
