package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringScheduleSummary extends StObject {
  
  /**
    * The creation time of the monitoring schedule.
    */
  var CreationTime: js.Date
  
  /**
    * The name of the endpoint using the monitoring schedule.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.undefined
  
  /**
    * The last time the monitoring schedule was modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * The name of the monitoring job definition that the schedule is for.
    */
  var MonitoringJobDefinitionName: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringJobDefinitionName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring schedule.
    */
  var MonitoringScheduleArn: typings.awsSdk.sagemakerMod.MonitoringScheduleArn
  
  /**
    * The name of the monitoring schedule.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName
  
  /**
    * The status of the monitoring schedule.
    */
  var MonitoringScheduleStatus: ScheduleStatus
  
  /**
    * The type of the monitoring job definition that the schedule is for.
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.sagemakerMod.MonitoringType] = js.undefined
}
object MonitoringScheduleSummary {
  
  inline def apply(
    CreationTime: js.Date,
    LastModifiedTime: js.Date,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): MonitoringScheduleSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleSummary]
  }
  
  extension [Self <: MonitoringScheduleSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "MonitoringJobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionNameUndefined: Self = StObject.set(x, "MonitoringJobDefinitionName", js.undefined)
    
    inline def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
  }
}
