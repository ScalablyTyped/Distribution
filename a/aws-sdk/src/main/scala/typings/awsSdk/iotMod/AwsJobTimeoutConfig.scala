package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobTimeoutConfig extends js.Object {
  
  /**
    * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal TIMED_OUT status.
    */
  var inProgressTimeoutInMinutes: js.UndefOr[AwsJobTimeoutInProgressTimeoutInMinutes] = js.native
}
object AwsJobTimeoutConfig {
  
  @scala.inline
  def apply(): AwsJobTimeoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobTimeoutConfig]
  }
  
  @scala.inline
  implicit class AwsJobTimeoutConfigOps[Self <: AwsJobTimeoutConfig] (val x: Self) extends AnyVal {
    
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
    def setInProgressTimeoutInMinutes(value: AwsJobTimeoutInProgressTimeoutInMinutes): Self = this.set("inProgressTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInProgressTimeoutInMinutes: Self = this.set("inProgressTimeoutInMinutes", js.undefined)
  }
}
