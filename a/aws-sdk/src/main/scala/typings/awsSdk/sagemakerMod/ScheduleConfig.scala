package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleConfig extends js.Object {
  
  /**
    * A cron expression that describes details about the monitoring schedule. Currently the only supported cron expressions are:   If you want to set the job to start every hour, please use the following:  Hourly: cron(0 * ? * * *)    If you want to start the job daily:  cron(0 [00-23] ? * * *)    For example, the following are valid cron expressions:   Daily at noon UTC: cron(0 12 ? * * *)    Daily at midnight UTC: cron(0 0 ? * * *)    To support running every 6, 12 hours, the following are also supported:  cron(0 [00-23]/[01-24] ? * * *)  For example, the following are valid cron expressions:   Every 12 hours, starting at 5pm UTC: cron(0 17/12 ? * * *)    Every two hours starting at midnight: cron(0 0/2 ? * * *)       Even though the cron expression is set to start at 5PM UTC, note that there could be a delay of 0-20 minutes from the actual requested time to run the execution.    We recommend that if you would like a daily schedule, you do not provide this parameter. Amazon SageMaker will pick a time for running every day.   
    */
  var ScheduleExpression: typings.awsSdk.sagemakerMod.ScheduleExpression = js.native
}
object ScheduleConfig {
  
  @scala.inline
  def apply(ScheduleExpression: ScheduleExpression): ScheduleConfig = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfig]
  }
  
  @scala.inline
  implicit class ScheduleConfigOps[Self <: ScheduleConfig] (val x: Self) extends AnyVal {
    
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
    def setScheduleExpression(value: ScheduleExpression): Self = this.set("ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
