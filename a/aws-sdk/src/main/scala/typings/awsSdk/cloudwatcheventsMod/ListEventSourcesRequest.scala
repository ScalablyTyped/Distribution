package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventSourcesRequest extends StObject {
  
  /**
    * Specifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * Specifying this limits the results to only those partner event sources with names that start with the specified prefix.
    */
  var NamePrefix: js.UndefOr[EventSourceNamePrefix] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.undefined
}
object ListEventSourcesRequest {
  
  @scala.inline
  def apply(): ListEventSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourcesRequest]
  }
  
  @scala.inline
  implicit class ListEventSourcesRequestMutableBuilder[Self <: ListEventSourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: EventSourceNamePrefix): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
