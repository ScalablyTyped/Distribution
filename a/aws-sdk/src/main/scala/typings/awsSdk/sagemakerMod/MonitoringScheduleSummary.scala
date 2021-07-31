package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringScheduleSummary extends StObject {
  
  /**
    * The creation time of the monitoring schedule.
    */
  var CreationTime: Timestamp
  
  /**
    * The name of the endpoint using the monitoring schedule.
    */
  var EndpointName: js.UndefOr[typings.awsSdk.sagemakerMod.EndpointName] = js.undefined
  
  /**
    * The last time the monitoring schedule was modified.
    */
  var LastModifiedTime: Timestamp
  
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
}
object MonitoringScheduleSummary {
  
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    LastModifiedTime: Timestamp,
    MonitoringScheduleArn: MonitoringScheduleArn,
    MonitoringScheduleName: MonitoringScheduleName,
    MonitoringScheduleStatus: ScheduleStatus
  ): MonitoringScheduleSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], MonitoringScheduleArn = MonitoringScheduleArn.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any], MonitoringScheduleStatus = MonitoringScheduleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleSummary]
  }
  
  @scala.inline
  implicit class MonitoringScheduleSummaryMutableBuilder[Self <: MonitoringScheduleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleArn(value: MonitoringScheduleArn): Self = StObject.set(x, "MonitoringScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleStatus(value: ScheduleStatus): Self = StObject.set(x, "MonitoringScheduleStatus", value.asInstanceOf[js.Any])
  }
}
