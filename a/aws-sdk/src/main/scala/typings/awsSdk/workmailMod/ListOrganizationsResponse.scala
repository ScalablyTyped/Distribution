package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOrganizationsResponse extends StObject {
  
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
  implicit class ListOrganizationsResponseMutableBuilder[Self <: ListOrganizationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setOrganizationSummaries(value: OrganizationSummaries): Self = StObject.set(x, "OrganizationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationSummariesUndefined: Self = StObject.set(x, "OrganizationSummaries", js.undefined)
    
    @scala.inline
    def setOrganizationSummariesVarargs(value: OrganizationSummary*): Self = StObject.set(x, "OrganizationSummaries", js.Array(value :_*))
  }
}
