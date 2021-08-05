package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringExecutionSummary extends StObject {
  
  /**
    * The time at which the monitoring job was created.
    */
  var CreationTime: Timestamp
  
  /**
    * The name of teh endpoint used to run the monitoring job.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.undefined
  
  /**
    * Contains the reason a monitoring job failed, if it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * A timestamp that indicates the last time the monitoring job was modified.
    */
  var LastModifiedTime: Timestamp
  
  /**
    * The status of the monitoring job.
    */
  var MonitoringExecutionStatus: ExecutionStatus
  
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring job.
    */
  var ProcessingJobArn: js.UndefOr[typings.awsSdk.sagemakerMod.ProcessingJobArn] = js.undefined
  
  /**
    * The time the monitoring job was scheduled.
    */
  var ScheduledTime: Timestamp
}
object MonitoringExecutionSummary {
  
  inline def apply(
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    MonitoringExecutionStatus: ExecutionStatus,
    MonitoringScheduleName: MonitoringScheduleName,
    ScheduledTime: Timestamp
  ): MonitoringExecutionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringExecutionStatus = MonitoringExecutionStatus.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], ScheduledTime = ScheduledTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringExecutionSummary]
  }
  
  extension [Self <: MonitoringExecutionSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringExecutionStatus(value: ExecutionStatus): Self = StObject.set(x, "MonitoringExecutionStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobArn(value: ProcessingJobArn): Self = StObject.set(x, "ProcessingJobArn", value.asInstanceOf[js.Any])
    
    inline def setProcessingJobArnUndefined: Self = StObject.set(x, "ProcessingJobArn", js.undefined)
    
    inline def setScheduledTime(value: Timestamp): Self = StObject.set(x, "ScheduledTime", value.asInstanceOf[js.Any])
  }
}
