package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginEndpointsRequest extends StObject {
  
  /**
    * When specified, the request will return only OriginEndpoints associated with the given Channel ID.
    */
  var ChannelId: js.UndefOr[string] = js.undefined
  
  /**
    * The upper bound on the number of records to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mediapackageMod.MaxResults] = js.undefined
  
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListOriginEndpointsRequest {
  
  @scala.inline
  def apply(): ListOriginEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginEndpointsRequest]
  }
  
  @scala.inline
  implicit class ListOriginEndpointsRequestMutableBuilder[Self <: ListOriginEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
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
