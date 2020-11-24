package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSignalingChannelsOutput extends js.Object {
  
  /**
    * An array of ChannelInfo objects.
    */
  var ChannelInfoList: js.UndefOr[typings.awsSdk.kinesisvideoMod.ChannelInfoList] = js.native
  
  /**
    * If the response is truncated, the call returns this element with a token. To get the next batch of streams, use this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
}
object ListSignalingChannelsOutput {
  
  @scala.inline
  def apply(): ListSignalingChannelsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalingChannelsOutput]
  }
  
  @scala.inline
  implicit class ListSignalingChannelsOutputOps[Self <: ListSignalingChannelsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelInfoListVarargs(value: ChannelInfo*): Self = this.set("ChannelInfoList", js.Array(value :_*))
    
    @scala.inline
    def setChannelInfoList(value: ChannelInfoList): Self = this.set("ChannelInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelInfoList: Self = this.set("ChannelInfoList", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
