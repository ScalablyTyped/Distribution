package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHarvestJobsRequest extends StObject {
  
  /**
    * When specified, the request will return only HarvestJobs associated with the given Channel ID.
    */
  var IncludeChannelId: js.UndefOr[string] = js.native
  
  /**
    * When specified, the request will return only HarvestJobs in the given status.
    */
  var IncludeStatus: js.UndefOr[string] = js.native
  
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackageMod.MaxResults] = js.native
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListHarvestJobsRequest {
  
  @scala.inline
  def apply(): ListHarvestJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHarvestJobsRequest]
  }
  
  @scala.inline
  implicit class ListHarvestJobsRequestMutableBuilder[Self <: ListHarvestJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeChannelId(value: string): Self = StObject.set(x, "IncludeChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeChannelIdUndefined: Self = StObject.set(x, "IncludeChannelId", js.undefined)
    
    @scala.inline
    def setIncludeStatus(value: string): Self = StObject.set(x, "IncludeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStatusUndefined: Self = StObject.set(x, "IncludeStatus", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
