package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSignalingChannelsOutput extends StObject {
  
  /**
    * An array of ChannelInfo objects.
    */
  var ChannelInfoList: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelInfoList] = js.undefined
  
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.undefined
}
object ListSignalingChannelsOutput {
  
  @scala.inline
  def apply(): ListSignalingChannelsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsOutput]
  }
  
  @scala.inline
  implicit class ListSignalingChannelsOutputMutableBuilder[Self <: ListSignalingChannelsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelInfoList(value: ChannelInfoList): Self = StObject.set(x, "ChannelInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelInfoListUndefined: Self = StObject.set(x, "ChannelInfoList", js.undefined)
    
    @scala.inline
    def setChannelInfoListVarargs(value: ChannelInfo*): Self = StObject.set(x, "ChannelInfoList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
