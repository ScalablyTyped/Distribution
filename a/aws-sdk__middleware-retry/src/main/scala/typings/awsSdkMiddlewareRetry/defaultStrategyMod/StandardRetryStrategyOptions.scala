package typings.awsSdkMiddlewareRetry.defaultStrategyMod

import typings.awsSdkSmithyClient.sdkErrorMod.SdkError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardRetryStrategyOptions extends js.Object {
  
  var delayDecider: js.UndefOr[DelayDecider] = js.native
  
  var retryDecider: js.UndefOr[RetryDecider] = js.native
  
  var retryQuota: js.UndefOr[RetryQuota] = js.native
}
object StandardRetryStrategyOptions {
  
  @scala.inline
  def apply(): StandardRetryStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardRetryStrategyOptions]
  }
  
  @scala.inline
  implicit class StandardRetryStrategyOptionsOps[Self <: StandardRetryStrategyOptions] (val x: Self) extends AnyVal {
    
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
    def setDelayDecider(value: (/* delayBase */ Double, /* attempts */ Double) => Double): Self = this.set("delayDecider", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDelayDecider: Self = this.set("delayDecider", js.undefined)
    
    @scala.inline
    def setRetryDecider(value: /* error */ SdkError => Boolean): Self = this.set("retryDecider", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRetryDecider: Self = this.set("retryDecider", js.undefined)
    
    @scala.inline
    def setRetryQuota(value: RetryQuota): Self = this.set("retryQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryQuota: Self = this.set("retryQuota", js.undefined)
  }
}
