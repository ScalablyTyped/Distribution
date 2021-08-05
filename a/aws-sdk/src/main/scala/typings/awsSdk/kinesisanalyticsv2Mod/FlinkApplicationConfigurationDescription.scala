package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlinkApplicationConfigurationDescription extends StObject {
  
  /**
    * Describes an application's checkpointing configuration. Checkpointing is the process of persisting application state for fault tolerance.
    */
  var CheckpointConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CheckpointConfigurationDescription] = js.undefined
  
  /**
    * The job plan for an application. For more information about the job plan, see Jobs and Scheduling in the Apache Flink Documentation. To retrieve the job plan for the application, use the DescribeApplicationRequest$IncludeAdditionalDetails parameter of the DescribeApplication operation.
    */
  var JobPlanDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.JobPlanDescription] = js.undefined
  
  /**
    * Describes configuration parameters for Amazon CloudWatch logging for an application.
    */
  var MonitoringConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MonitoringConfigurationDescription] = js.undefined
  
  /**
    * Describes parameters for how an application executes multiple tasks simultaneously.
    */
  var ParallelismConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParallelismConfigurationDescription] = js.undefined
}
object FlinkApplicationConfigurationDescription {
  
  inline def apply(): FlinkApplicationConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlinkApplicationConfigurationDescription]
  }
  
  extension [Self <: FlinkApplicationConfigurationDescription](x: Self) {
    
    inline def setCheckpointConfigurationDescription(value: CheckpointConfigurationDescription): Self = StObject.set(x, "CheckpointConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigurationDescriptionUndefined: Self = StObject.set(x, "CheckpointConfigurationDescription", js.undefined)
    
    inline def setJobPlanDescription(value: JobPlanDescription): Self = StObject.set(x, "JobPlanDescription", value.asInstanceOf[js.Any])
    
    inline def setJobPlanDescriptionUndefined: Self = StObject.set(x, "JobPlanDescription", js.undefined)
    
    inline def setMonitoringConfigurationDescription(value: MonitoringConfigurationDescription): Self = StObject.set(x, "MonitoringConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setMonitoringConfigurationDescriptionUndefined: Self = StObject.set(x, "MonitoringConfigurationDescription", js.undefined)
    
    inline def setParallelismConfigurationDescription(value: ParallelismConfigurationDescription): Self = StObject.set(x, "ParallelismConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setParallelismConfigurationDescriptionUndefined: Self = StObject.set(x, "ParallelismConfigurationDescription", js.undefined)
  }
}
