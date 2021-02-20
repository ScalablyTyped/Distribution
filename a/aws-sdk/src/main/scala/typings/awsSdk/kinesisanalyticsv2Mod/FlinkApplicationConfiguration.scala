package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlinkApplicationConfiguration extends StObject {
  
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance. For more information, see  Checkpoints for Fault Tolerance in the Apache Flink Documentation. 
    */
  var CheckpointConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointConfiguration] = js.native
  
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MonitoringConfiguration] = js.native
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfiguration: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismConfiguration] = js.native
}
object FlinkApplicationConfiguration {
  
  @scala.inline
  def apply(): FlinkApplicationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfiguration]
  }
  
  @scala.inline
  implicit class FlinkApplicationConfigurationMutableBuilder[Self <: FlinkApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckpointConfiguration(value: CheckpointConfiguration): Self = StObject.set(x, "CheckpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckpointConfigurationUndefined: Self = StObject.set(x, "CheckpointConfiguration", js.undefined)
    
    @scala.inline
    def setMonitoringConfiguration(value: MonitoringConfiguration): Self = StObject.set(x, "MonitoringConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringConfigurationUndefined: Self = StObject.set(x, "MonitoringConfiguration", js.undefined)
    
    @scala.inline
    def setParallelismConfiguration(value: ParallelismConfiguration): Self = StObject.set(x, "ParallelismConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismConfigurationUndefined: Self = StObject.set(x, "ParallelismConfiguration", js.undefined)
  }
}
