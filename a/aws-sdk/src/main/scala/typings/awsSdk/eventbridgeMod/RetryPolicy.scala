package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryPolicy extends StObject {
  
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
  implicit class RetryPolicyMutableBuilder[Self <: RetryPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumEventAgeInSeconds(value: MaximumEventAgeInSeconds): Self = StObject.set(x, "MaximumEventAgeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumEventAgeInSecondsUndefined: Self = StObject.set(x, "MaximumEventAgeInSeconds", js.undefined)
    
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttempts): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
  }
}
