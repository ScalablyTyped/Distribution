package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedMonitoringOutput extends StObject {
  
  /**
    * Represents the current state of the metrics that are in the enhanced state before the operation.
    */
  var CurrentShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  
  /**
    * Represents the list of all the metrics that would be in the enhanced state after the operation.
    */
  var DesiredShardLevelMetrics: js.UndefOr[MetricsNameList] = js.native
  
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisMod.StreamName] = js.native
}
object EnhancedMonitoringOutput {
  
  @scala.inline
  def apply(): EnhancedMonitoringOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhancedMonitoringOutput]
  }
  
  @scala.inline
  implicit class EnhancedMonitoringOutputMutableBuilder[Self <: EnhancedMonitoringOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "CurrentShardLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentShardLevelMetricsUndefined: Self = StObject.set(x, "CurrentShardLevelMetrics", js.undefined)
    
    @scala.inline
    def setCurrentShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "CurrentShardLevelMetrics", js.Array(value :_*))
    
    @scala.inline
    def setDesiredShardLevelMetrics(value: MetricsNameList): Self = StObject.set(x, "DesiredShardLevelMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredShardLevelMetricsUndefined: Self = StObject.set(x, "DesiredShardLevelMetrics", js.undefined)
    
    @scala.inline
    def setDesiredShardLevelMetricsVarargs(value: MetricsName*): Self = StObject.set(x, "DesiredShardLevelMetrics", js.Array(value :_*))
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
