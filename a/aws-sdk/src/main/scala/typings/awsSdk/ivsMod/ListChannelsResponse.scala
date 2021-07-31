package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsResponse extends StObject {
  
  /**
    * List of the matching channels.
    */
  var channels: ChannelList
  
  /**
    * If there are more channels than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListChannelsResponse {
  
  @scala.inline
  def apply(channels: ChannelList): ListChannelsResponse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit class ListChannelsResponseMutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: ChannelList): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: ChannelSummary*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
