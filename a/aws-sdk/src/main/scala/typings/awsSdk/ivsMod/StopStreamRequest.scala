package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopStreamRequest extends StObject {
  
  /**
    * ARN of the channel for which the stream is to be stopped.
    */
  var channelArn: ChannelArn
}
object StopStreamRequest {
  
  inline def apply(channelArn: ChannelArn): StopStreamRequest = {
    val __obj = js.Dynamic.literal(channelArn = channelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopStreamRequest]
  }
  
  extension [Self <: StopStreamRequest](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
  }
}
