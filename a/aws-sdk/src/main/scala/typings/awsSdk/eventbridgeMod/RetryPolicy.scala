package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryPolicy extends js.Object {
  
  /**
    * The maximum amount of time, in seconds, to continue to make retry attempts.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typings.awsSdk.eventbridgeMod.MaximumEventAgeInSeconds] = js.native
  
  /**
    * The maximum number of retry attempts to make before the request fails. Retry attempts continue until either the maximum number of attempts is made or until the duration of the MaximumEventAgeInSeconds is met.
    */
  var MaximumRetryAttempts: js.UndefOr[typings.awsSdk.eventbridgeMod.MaximumRetryAttempts] = js.native
}
object RetryPolicy {
  
  @scala.inline
  def apply(): RetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryPolicy]
  }
  
  @scala.inline
  implicit class RetryPolicyOps[Self <: RetryPolicy] (val x: Self) extends AnyVal {
    
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
    def setMaximumEventAgeInSeconds(value: MaximumEventAgeInSeconds): Self = this.set("MaximumEventAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumEventAgeInSeconds: Self = this.set("MaximumEventAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttempts): Self = this.set("MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("MaximumRetryAttempts", js.undefined)
  }
}
