package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshTrustedAdvisorCheckResponse extends js.Object {
  
  /**
    * The current refresh status for a check, including the amount of time until the check is eligible for refresh.
    */
  var status: TrustedAdvisorCheckRefreshStatus = js.native
}
object RefreshTrustedAdvisorCheckResponse {
  
  @scala.inline
  def apply(status: TrustedAdvisorCheckRefreshStatus): RefreshTrustedAdvisorCheckResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckResponse]
  }
  
  @scala.inline
  implicit class RefreshTrustedAdvisorCheckResponseOps[Self <: RefreshTrustedAdvisorCheckResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: TrustedAdvisorCheckRefreshStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
