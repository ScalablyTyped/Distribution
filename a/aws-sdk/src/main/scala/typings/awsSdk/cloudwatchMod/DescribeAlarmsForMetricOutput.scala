package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmsForMetricOutput extends StObject {
  
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.undefined
}
object DescribeAlarmsForMetricOutput {
  
  inline def apply(): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
  
  extension [Self <: DescribeAlarmsForMetricOutput](x: Self) {
    
    inline def setMetricAlarms(value: MetricAlarms): Self = StObject.set(x, "MetricAlarms", value.asInstanceOf[js.Any])
    
    inline def setMetricAlarmsUndefined: Self = StObject.set(x, "MetricAlarms", js.undefined)
    
    inline def setMetricAlarmsVarargs(value: MetricAlarm*): Self = StObject.set(x, "MetricAlarms", js.Array(value*))
  }
}
