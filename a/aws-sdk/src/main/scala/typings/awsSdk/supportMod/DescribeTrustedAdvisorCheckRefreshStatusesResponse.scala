package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends js.Object {
  
  /**
    * The refresh status of the specified Trusted Advisor checks.
    */
  var statuses: TrustedAdvisorCheckRefreshStatusList = js.native
}
object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
  
  @scala.inline
  def apply(statuses: TrustedAdvisorCheckRefreshStatusList): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
    val __obj = js.Dynamic.literal(statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckRefreshStatusesResponseOps[Self <: DescribeTrustedAdvisorCheckRefreshStatusesResponse] (val x: Self) extends AnyVal {
    
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
    def setStatusesVarargs(value: TrustedAdvisorCheckRefreshStatus*): Self = this.set("statuses", js.Array(value :_*))
    
    @scala.inline
    def setStatuses(value: TrustedAdvisorCheckRefreshStatusList): Self = this.set("statuses", value.asInstanceOf[js.Any])
  }
}
