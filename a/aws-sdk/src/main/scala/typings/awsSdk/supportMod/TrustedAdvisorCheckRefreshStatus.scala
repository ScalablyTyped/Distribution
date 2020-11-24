package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedAdvisorCheckRefreshStatus extends js.Object {
  
  /**
    * The unique identifier for the Trusted Advisor check.
    */
  var checkId: String = js.native
  
  /**
    * The amount of time, in milliseconds, until the Trusted Advisor check is eligible for refresh.
    */
  var millisUntilNextRefreshable: Long = js.native
  
  /**
    * The status of the Trusted Advisor check for which a refresh has been requested:     none: The check is not refreshed or the non-success status exceeds the timeout    enqueued: The check refresh requests has entered the refresh queue    processing: The check refresh request is picked up by the rule processing engine    success: The check is successfully refreshed    abandoned: The check refresh has failed  
    */
  var status: String = js.native
}
object TrustedAdvisorCheckRefreshStatus {
  
  @scala.inline
  def apply(checkId: String, millisUntilNextRefreshable: Long, status: String): TrustedAdvisorCheckRefreshStatus = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any], millisUntilNextRefreshable = millisUntilNextRefreshable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorCheckRefreshStatus]
  }
  
  @scala.inline
  implicit class TrustedAdvisorCheckRefreshStatusOps[Self <: TrustedAdvisorCheckRefreshStatus] (val x: Self) extends AnyVal {
    
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
    def setCheckId(value: String): Self = this.set("checkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisUntilNextRefreshable(value: Long): Self = this.set("millisUntilNextRefreshable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
