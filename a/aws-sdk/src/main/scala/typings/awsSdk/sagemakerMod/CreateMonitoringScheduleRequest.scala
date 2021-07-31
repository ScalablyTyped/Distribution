package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitoringScheduleRequest extends StObject {
  
  /**
    * The configuration object that specifies the monitoring schedule and defines the monitoring job.
    */
  var MonitoringScheduleConfig: typings.awsSdk.sagemakerMod.MonitoringScheduleConfig
  
  /**
    * The name of the monitoring schedule. The name must be unique within an AWS Region within an AWS account.
    */
  var MonitoringScheduleName: typings.awsSdk.sagemakerMod.MonitoringScheduleName
  
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMonitoringScheduleRequest {
  
  @scala.inline
  def apply(MonitoringScheduleConfig: MonitoringScheduleConfig, MonitoringScheduleName: MonitoringScheduleName): CreateMonitoringScheduleRequest = {
    val __obj = js.Dynamic.literal(MonitoringScheduleConfig = MonitoringScheduleConfig.asInstanceOf[js.Any], MonitoringScheduleName = MonitoringScheduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringScheduleRequest]
  }
  
  @scala.inline
  implicit class CreateMonitoringScheduleRequestMutableBuilder[Self <: CreateMonitoringScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringScheduleConfig(value: MonitoringScheduleConfig): Self = StObject.set(x, "MonitoringScheduleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringScheduleName(value: MonitoringScheduleName): Self = StObject.set(x, "MonitoringScheduleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
