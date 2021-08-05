package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamKeyRequest extends StObject {
  
  /**
    * ARN of the channel for which to create the stream key.
    */
  var channelArn: ChannelArn
  
  /**
    * See Channel$tags.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateStreamKeyRequest {
  
  inline def apply(channelArn: ChannelArn): CreateStreamKeyRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamKeyRequest]
  }
  
  extension [Self <: CreateStreamKeyRequest](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
