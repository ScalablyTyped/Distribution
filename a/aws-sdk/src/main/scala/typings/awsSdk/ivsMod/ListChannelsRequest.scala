package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsRequest extends StObject {
  
  /**
    * Filters the channel list to match the specified name.
    */
  var filterByName: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Maximum number of channels to return.
    */
  var maxResults: js.UndefOr[MaxChannelResults] = js.undefined
  
  /**
    * The first channel to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListChannelsRequest {
  
  @scala.inline
  def apply(): ListChannelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsRequest]
  }
  
  @scala.inline
  implicit class ListChannelsRequestMutableBuilder[Self <: ListChannelsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterByName(value: ChannelName): Self = StObject.set(x, "filterByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterByNameUndefined: Self = StObject.set(x, "filterByName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxChannelResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
