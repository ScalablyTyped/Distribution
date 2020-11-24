package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitoringScheduleConfig extends js.Object {
  
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: typings.awsSdk.sagemakerMod.MonitoringJobDefinition = js.native
  
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ScheduleConfig] = js.native
}
object MonitoringScheduleConfig {
  
  @scala.inline
  def apply(MonitoringJobDefinition: MonitoringJobDefinition): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal(MonitoringJobDefinition = MonitoringJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
  
  @scala.inline
  implicit class MonitoringScheduleConfigOps[Self <: MonitoringScheduleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMonitoringJobDefinition(value: MonitoringJobDefinition): Self = this.set("MonitoringJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleConfig(value: ScheduleConfig): Self = this.set("ScheduleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleConfig: Self = this.set("ScheduleConfig", js.undefined)
  }
}
