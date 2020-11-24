package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobExecutionsRolloutConfig extends js.Object {
  
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate increase for a job rollout.
    */
  var exponentialRate: js.UndefOr[AwsJobExponentialRolloutRate] = js.native
  
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.native
}
object AwsJobExecutionsRolloutConfig {
  
  @scala.inline
  def apply(): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
  
  @scala.inline
  implicit class AwsJobExecutionsRolloutConfigOps[Self <: AwsJobExecutionsRolloutConfig] (val x: Self) extends AnyVal {
    
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
    def setExponentialRate(value: AwsJobExponentialRolloutRate): Self = this.set("exponentialRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExponentialRate: Self = this.set("exponentialRate", js.undefined)
    
    @scala.inline
    def setMaximumPerMinute(value: MaximumPerMinute): Self = this.set("maximumPerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumPerMinute: Self = this.set("maximumPerMinute", js.undefined)
  }
}
