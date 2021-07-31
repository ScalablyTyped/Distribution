package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamKeysRequest extends StObject {
  
  /**
    * Channel ARN used to filter the list.
    */
  var channelArn: ChannelArn
  
  /**
    * Maximum number of streamKeys to return.
    */
  var maxResults: js.UndefOr[MaxStreamKeyResults] = js.undefined
  
  /**
    * The first stream key to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStreamKeysRequest {
  
  @scala.inline
  def apply(channelArn: ChannelArn): ListStreamKeysRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamKeysRequest]
  }
  
  @scala.inline
  implicit class ListStreamKeysRequestMutableBuilder[Self <: ListStreamKeysRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxStreamKeyResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
