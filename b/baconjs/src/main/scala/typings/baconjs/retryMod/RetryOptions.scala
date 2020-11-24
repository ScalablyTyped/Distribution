package typings.baconjs.retryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryOptions[V] extends js.Object {
  
  /**
    *  Optional. A function that returns the time in milliseconds to wait before retrying. Defaults to `0`. The function is given a context object with the keys ```error``` (the error that occurred) and `retriesDone` (the number of retries already performed) to help determine the appropriate delay e.g. for an incremental backoff.
    */
  var delay: js.UndefOr[js.Function1[/* context */ RetryContext, Double]] = js.native
  
  /**
    * Optional. A function returning `true` to continue retrying, `false` to stop. Defaults to `true`. The error that occurred is given as a parameter. For example, there is usually no reason to retry a 404 HTTP error, whereas a 500 or a timeout might work on the next attempt.
    */
  var isRetryable: js.UndefOr[js.Function1[/* error */ js.Any, Boolean]] = js.native
  
  /**
    * Required. The number of times to retry the `source` function _in addition to the initial attempt_. The default value is 0 (zero) for retrying indefinitely.
    */
  var retries: js.UndefOr[Double] = js.native
  
  /**
    * Required. A function that produces an Observable. The function gets attempt number (starting from zero) as its argument.
    */
  def source(attemptNumber: Double): typings.baconjs.observableMod.default[V] = js.native
}
object RetryOptions {
  
  @scala.inline
  def apply[V](source: Double => typings.baconjs.observableMod.default[V]): RetryOptions[V] = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction1(source))
    __obj.asInstanceOf[RetryOptions[V]]
  }
  
  @scala.inline
  implicit class RetryOptionsOps[Self <: RetryOptions[_], V] (val x: Self with RetryOptions[V]) extends AnyVal {
    
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
    def setSource(value: Double => typings.baconjs.observableMod.default[V]): Self = this.set("source", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelay(value: /* context */ RetryContext => Double): Self = this.set("delay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setIsRetryable(value: /* error */ js.Any => Boolean): Self = this.set("isRetryable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsRetryable: Self = this.set("isRetryable", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
  }
}
