package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSignalingChannelsInput extends StObject {
  
  /**
    * Optional: Returns only the channels that satisfy a specific condition.
    */
  var ChannelNameCondition: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelNameCondition] = js.native
  
  /**
    * The maximum number of channels to return in the response. The default is 500.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.native
  
  /**
    * If you specify this parameter, when the result of a ListSignalingChannels operation is truncated, the call returns the NextToken in the response. To get another batch of channels, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
}
object ListSignalingChannelsInput {
  
  @scala.inline
  def apply(): ListSignalingChannelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsInput]
  }
  
  @scala.inline
  implicit class ListSignalingChannelsInputMutableBuilder[Self <: ListSignalingChannelsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelNameCondition(value: ChannelNameCondition): Self = StObject.set(x, "ChannelNameCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNameConditionUndefined: Self = StObject.set(x, "ChannelNameCondition", js.undefined)
    
    @scala.inline
    def setMaxResults(value: ListStreamsInputLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
