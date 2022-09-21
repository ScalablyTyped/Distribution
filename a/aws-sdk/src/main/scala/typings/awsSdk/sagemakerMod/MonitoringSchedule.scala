package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringSchedule extends StObject {
  
  /**
    * The time that the monitoring schedule was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoint that hosts the model being monitored.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.undefined
  
  /**
    * If the monitoring schedule failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The last time the monitoring schedule was changed.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var LastMonitoringExecutionSummary: js.UndefOr[MonitoringExecutionSummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleArn] = js.undefined
  
  var MonitoringScheduleConfig: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleConfig] = js.undefined
  
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringScheduleName] = js.undefined
  
  /**
    * The status of the monitoring schedule. This can be one of the following values.    PENDING - The schedule is pending being created.    FAILED - The schedule failed.    SCHEDULED - The schedule was successfully created.    STOPPED - The schedule was stopped.  
    */
  var MonitoringScheduleStatus: js.UndefOr[ScheduleStatus] = js.undefined
  
  /**
    * The type of the monitoring job definition to schedule.
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringType] = js.undefined
  
  /**
    * A list of the tags associated with the monitoring schedlue. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object MonitoringSchedule {
  
  inline def apply(): MonitoringSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringSchedule]
  }
  
  extension [Self <: MonitoringSchedule](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLastMonitoringExecutionSummary(value: MonitoringExecutionSummary): Self = StObject.set(x, "LastMonitoringExecutionSummary", value.asInstanceOf[js.Any])
    
    inline def setLastMonitoringExecutionSummaryUndefined: Self = StObject.set(x, "LastMonitoringExecutionSummary", js.undefined)
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleArnUndefined: Self = StObject.set(x, "MonitoringScheduleArn", js.undefined)
    
    inline def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleConfigUndefined: Self = StObject.set(x, "MonitoringScheduleConfig", js.undefined)
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleNameUndefined: Self = StObject.set(x, "MonitoringScheduleName", js.undefined)
    
    inline def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleStatusUndefined: Self = StObject.set(x, "MonitoringScheduleStatus", js.undefined)
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
