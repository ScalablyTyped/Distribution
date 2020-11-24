package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeBasedAutoScalingConfiguration extends js.Object {
  
  /**
    * A WeeklyAutoScalingSchedule object with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.native
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}
object TimeBasedAutoScalingConfiguration {
  
  @scala.inline
  def apply(): TimeBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedAutoScalingConfiguration]
  }
  
  @scala.inline
  implicit class TimeBasedAutoScalingConfigurationOps[Self <: TimeBasedAutoScalingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingSchedule(value: WeeklyAutoScalingSchedule): Self = this.set("AutoScalingSchedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScalingSchedule: Self = this.set("AutoScalingSchedule", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
}
