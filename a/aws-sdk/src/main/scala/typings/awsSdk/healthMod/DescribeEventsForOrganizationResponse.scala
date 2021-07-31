package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsForOrganizationResponse extends StObject {
  
  /**
    * The events that match the specified filter criteria.
    */
  var events: js.UndefOr[OrganizationEventList] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
}
object DescribeEventsForOrganizationResponse {
  
  @scala.inline
  def apply(): DescribeEventsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsForOrganizationResponse]
  }
  
  @scala.inline
  implicit class DescribeEventsForOrganizationResponseMutableBuilder[Self <: DescribeEventsForOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: OrganizationEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: OrganizationEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
