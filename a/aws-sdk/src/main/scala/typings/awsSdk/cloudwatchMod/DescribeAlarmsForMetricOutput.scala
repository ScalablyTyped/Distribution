package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAlarmsForMetricOutput extends StObject {
  
  /**
    * The information for each alarm with the specified metric.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.native
}
object DescribeAlarmsForMetricOutput {
  
  @scala.inline
  def apply(): DescribeAlarmsForMetricOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsForMetricOutput]
  }
  
  @scala.inline
  implicit class DescribeAlarmsForMetricOutputMutableBuilder[Self <: DescribeAlarmsForMetricOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricAlarms(value: MetricAlarms): Self = StObject.set(x, "MetricAlarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricAlarmsUndefined: Self = StObject.set(x, "MetricAlarms", js.undefined)
    
    @scala.inline
    def setMetricAlarmsVarargs(value: MetricAlarm*): Self = StObject.set(x, "MetricAlarms", js.Array(value :_*))
  }
}
