package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilizationMetric extends StObject {
  
  /**
    * The name of the utilization metric.  The Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var name: js.UndefOr[MetricName] = js.undefined
  
  /**
    * The statistic of the utilization metric.
    */
  var statistic: js.UndefOr[MetricStatistic] = js.undefined
  
  /**
    * The value of the utilization metric.
    */
  var value: js.UndefOr[MetricValue] = js.undefined
}
object UtilizationMetric {
  
  inline def apply(): UtilizationMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilizationMetric]
  }
  
  extension [Self <: UtilizationMetric](x: Self) {
    
    inline def setName(value: MetricName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatistic(value: MetricStatistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    
    inline def setValue(value: MetricValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
