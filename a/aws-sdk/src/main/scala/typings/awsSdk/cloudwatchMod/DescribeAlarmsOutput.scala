package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmsOutput extends StObject {
  
  /**
    * The information about any composite alarms returned by the operation.
    */
  var CompositeAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.CompositeAlarms] = js.undefined
  
  /**
    * The information about any metric alarms returned by the operation.
    */
  var MetricAlarms: js.UndefOr[typings.awsSdk.cloudwatchMod.MetricAlarms] = js.undefined
  
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object DescribeAlarmsOutput {
  
  inline def apply(): DescribeAlarmsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmsOutput]
  }
  
  extension [Self <: DescribeAlarmsOutput](x: Self) {
    
    inline def setCompositeAlarms(value: CompositeAlarms): Self = StObject.set(x, "CompositeAlarms", value.asInstanceOf[js.Any])
    
    inline def setCompositeAlarmsUndefined: Self = StObject.set(x, "CompositeAlarms", js.undefined)
    
    inline def setCompositeAlarmsVarargs(value: CompositeAlarm*): Self = StObject.set(x, "CompositeAlarms", js.Array(value :_*))
    
    inline def setMetricAlarms(value: MetricAlarms): Self = StObject.set(x, "MetricAlarms", value.asInstanceOf[js.Any])
    
    inline def setMetricAlarmsUndefined: Self = StObject.set(x, "MetricAlarms", js.undefined)
    
    inline def setMetricAlarmsVarargs(value: MetricAlarm*): Self = StObject.set(x, "MetricAlarms", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
