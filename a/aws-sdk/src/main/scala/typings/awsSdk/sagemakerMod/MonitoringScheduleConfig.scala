package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringScheduleConfig extends StObject {
  
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: typings.awsSdk.sagemakerMod.MonitoringJobDefinition
  
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ScheduleConfig] = js.undefined
}
object MonitoringScheduleConfig {
  
  @scala.inline
  def apply(MonitoringJobDefinition: MonitoringJobDefinition): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal(MonitoringJobDefinition = MonitoringJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
  
  @scala.inline
  implicit class MonitoringScheduleConfigMutableBuilder[Self <: MonitoringScheduleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMonitoringJobDefinition(value: MonitoringJobDefinition): Self = StObject.set(x, "MonitoringJobDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleConfig(value: ScheduleConfig): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleConfigUndefined: Self = StObject.set(x, "ScheduleConfig", js.undefined)
  }
}
