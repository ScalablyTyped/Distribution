package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOrganizationsResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
  
  /**
    * The overview of owned organizations presented as a list of organization summaries.
    */
  var OrganizationSummaries: js.UndefOr[typings.awsSdk.workmailMod.OrganizationSummaries] = js.native
}
object ListOrganizationsResponse {
  
  @scala.inline
  def apply(): ListOrganizationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationsResponse]
  }
  
  @scala.inline
  implicit class ListOrganizationsResponseOps[Self <: ListOrganizationsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationSummariesVarargs(value: OrganizationSummary*): Self = this.set("OrganizationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationSummaries(value: OrganizationSummaries): Self = this.set("OrganizationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationSummaries: Self = this.set("OrganizationSummaries", js.undefined)
  }
}
