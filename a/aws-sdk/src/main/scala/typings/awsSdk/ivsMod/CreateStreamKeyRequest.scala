package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamKeyRequest extends StObject {
  
  /**
    * ARN of the channel for which to create the stream key.
    */
  var channelArn: ChannelArn = js.native
  
  /**
    * See Channel$tags.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateStreamKeyRequest {
  
  @scala.inline
  def apply(channelArn: ChannelArn): CreateStreamKeyRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamKeyRequest]
  }
  
  @scala.inline
  implicit class CreateStreamKeyRequestMutableBuilder[Self <: CreateStreamKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
