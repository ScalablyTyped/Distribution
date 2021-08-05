package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMetadataRequest extends StObject {
  
  /**
    * ARN of the channel into which metadata is inserted. This channel must have an active stream.
    */
  var channelArn: ChannelArn
  
  /**
    * Metadata to insert into the stream. Maximum: 1 KB per request.
    */
  var metadata: StreamMetadata
}
object PutMetadataRequest {
  
  inline def apply(channelArn: ChannelArn, metadata: StreamMetadata): PutMetadataRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutMetadataRequest]
  }
  
  extension [Self <: PutMetadataRequest](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: StreamMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
