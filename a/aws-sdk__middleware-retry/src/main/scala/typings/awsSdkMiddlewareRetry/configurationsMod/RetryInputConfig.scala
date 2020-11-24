package typings.awsSdkMiddlewareRetry.configurationsMod

import typings.awsSdkTypes.utilMod.Provider
import typings.awsSdkTypes.utilMod.RetryStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryInputConfig extends js.Object {
  
  /**
    * The maximum number of times requests that encounter retryable failures should be attempted.
    */
  var maxAttempts: js.UndefOr[Double | Provider[Double]] = js.native
  
  /**
    * The strategy to retry the request. Using built-in exponential backoff strategy by default.
    */
  var retryStrategy: js.UndefOr[RetryStrategy] = js.native
}
object RetryInputConfig {
  
  @scala.inline
  def apply(): RetryInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryInputConfig]
  }
  
  @scala.inline
  implicit class RetryInputConfigOps[Self <: RetryInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxAttemptsFunction0(value: () => js.Promise[Double]): Self = this.set("maxAttempts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaxAttempts(value: Double | Provider[Double]): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    
    @scala.inline
    def setRetryStrategy(value: RetryStrategy): Self = this.set("retryStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryStrategy: Self = this.set("retryStrategy", js.undefined)
  }
}
