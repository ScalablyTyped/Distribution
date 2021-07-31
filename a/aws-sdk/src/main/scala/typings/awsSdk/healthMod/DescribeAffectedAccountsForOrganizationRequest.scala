package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAffectedAccountsForOrganizationRequest extends StObject {
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: typings.awsSdk.healthMod.eventArn
  
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typings.awsSdk.healthMod.maxResults] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
}
object DescribeAffectedAccountsForOrganizationRequest {
  
  @scala.inline
  def apply(eventArn: eventArn): DescribeAffectedAccountsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(eventArn = eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationRequest]
  }
  
  @scala.inline
  implicit class DescribeAffectedAccountsForOrganizationRequestMutableBuilder[Self <: DescribeAffectedAccountsForOrganizationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: maxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
