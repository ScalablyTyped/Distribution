package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedMonitoringOutput extends StObject {
  
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.undefined
  
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.undefined
}
object EnhancedMonitoringOutput {
  
  inline def apply(): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
  
  extension [Self <: EnhancedMonitoringOutput](x: Self) {
    
    inline def setCurrentShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setCurrentShardLevelMetricsUndefined: Self = StObject.set(x, "CurrentShardLevelMetrics", js.undefined)
    
    inline def setCurrentShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "CurrentShardLevelMetrics", js.Array(value*))
    
    inline def setDesiredShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
    
    inline def setDesiredShardLevelMetricsUndefined: Self = StObject.set(x, "DesiredShardLevelMetrics", js.undefined)
    
    inline def setDesiredShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "DesiredShardLevelMetrics", js.Array(value*))
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
