package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrustedAdvisorCheckRefreshStatusesResponse extends StObject {
  
  /**
    * The refresh status of the specified Trusted Advisor checks.
    */
  var statuses: TrustedAdvisorCheckRefreshStatusList
}
object DescribeTrustedAdvisorCheckRefreshStatusesResponse {
  
  @scala.inline
  def apply(statuses: TrustedAdvisorCheckRefreshStatusList): DescribeTrustedAdvisorCheckRefreshStatusesResponse = {
    val __obj = js.Dynamic.literal(statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  }
  
  @scala.inline
  implicit class DescribeTrustedAdvisorCheckRefreshStatusesResponseMutableBuilder[Self <: DescribeTrustedAdvisorCheckRefreshStatusesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatuses(value: TrustedAdvisorCheckRefreshStatusList): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusesVarargs(value: TrustedAdvisorCheckRefreshStatus*): Self = StObject.set(x, "statuses", js.Array(value :_*))
  }
}
