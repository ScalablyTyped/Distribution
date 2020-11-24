package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeOrganizationConformancePacksRequest extends js.Object {
  
  /**
    * The maximum number of organization config packs returned on each page. If you do no specify a number, AWS Config uses the default. The default is 100.
    */
  var Limit: js.UndefOr[CosmosPageLimit] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The name that you assign to an organization conformance pack.
    */
  var OrganizationConformancePackNames: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationConformancePackNames] = js.native
}
object DescribeOrganizationConformancePacksRequest {
  
  @scala.inline
  def apply(): DescribeOrganizationConformancePacksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConformancePacksRequest]
  }
  
  @scala.inline
  implicit class DescribeOrganizationConformancePacksRequestOps[Self <: DescribeOrganizationConformancePacksRequest] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: CosmosPageLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationConformancePackNamesVarargs(value: OrganizationConformancePackName*): Self = this.set("OrganizationConformancePackNames", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationConformancePackNames(value: OrganizationConformancePackNames): Self = this.set("OrganizationConformancePackNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationConformancePackNames: Self = this.set("OrganizationConformancePackNames", js.undefined)
  }
}
