package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCampaignsRequest extends StObject {
  
  /**
    * The maximum number of campaigns to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token returned from the previous call to ListCampaigns for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the solution to list the campaigns for. When a solution is not specified, all the campaigns associated with the account are listed.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
}
object ListCampaignsRequest {
  
  @scala.inline
  def apply(): ListCampaignsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCampaignsRequest]
  }
  
  @scala.inline
  implicit class ListCampaignsRequestMutableBuilder[Self <: ListCampaignsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
  }
}
