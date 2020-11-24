package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOrganizationConformancePackDetailedStatusResponse extends js.Object {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of OrganizationConformancePackDetailedStatus objects. 
    */
  var OrganizationConformancePackDetailedStatuses: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackDetailedStatuses] = js.native
}
object GetOrganizationConformancePackDetailedStatusResponse {
  
  @scala.inline
  def apply(): GetOrganizationConformancePackDetailedStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationConformancePackDetailedStatusResponse]
  }
  
  @scala.inline
  implicit class GetOrganizationConformancePackDetailedStatusResponseOps[Self <: GetOrganizationConformancePackDetailedStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackDetailedStatusesVarargs(value: OrganizationConformancePackDetailedStatus*): Self = this.set("OrganizationConformancePackDetailedStatuses", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConformancePackDetailedStatuses(value: OrganizationConformancePackDetailedStatuses): Self = this.set("OrganizationConformancePackDetailedStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConformancePackDetailedStatuses: Self = this.set("OrganizationConformancePackDetailedStatuses", js.undefined)
  }
}
