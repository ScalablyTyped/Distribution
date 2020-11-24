package typings.awsSdkSmithyClient.retryableTraitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetryableTrait extends js.Object {
  
  /**
    * Indicates that the error is a retryable throttling error.
    */
  val throttling: js.UndefOr[Boolean] = js.native
}
object RetryableTrait {
  
  @scala.inline
  def apply(): RetryableTrait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetryableTrait]
  }
  
  @scala.inline
  implicit class RetryableTraitOps[Self <: RetryableTrait] (val x: Self) extends AnyVal {
    
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
    def setThrottling(value: Boolean): Self = this.set("throttling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottling: Self = this.set("throttling", js.undefined)
  }
}
