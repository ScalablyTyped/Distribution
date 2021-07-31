package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBasedAutoScalingConfiguration extends StObject {
  
  /**
    * A WeeklyAutoScalingSchedule object with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object TimeBasedAutoScalingConfiguration {
  
  @scala.inline
  def apply(): TimeBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedAutoScalingConfiguration]
  }
  
  @scala.inline
  implicit class TimeBasedAutoScalingConfigurationMutableBuilder[Self <: TimeBasedAutoScalingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingSchedule(value: WeeklyAutoScalingSchedule): Self = StObject.set(x, "AutoScalingSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingScheduleUndefined: Self = StObject.set(x, "AutoScalingSchedule", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
