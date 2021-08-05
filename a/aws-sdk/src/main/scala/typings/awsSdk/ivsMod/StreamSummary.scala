package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamSummary extends StObject {
  
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * The stream’s health.
    */
  var health: js.UndefOr[StreamHealth] = js.undefined
  
  /**
    * ISO-8601 formatted timestamp of the stream’s start.
    */
  var startTime: js.UndefOr[StreamStartTime] = js.undefined
  
  /**
    * The stream’s state.
    */
  var state: js.UndefOr[StreamState] = js.undefined
  
  /**
    * Number of current viewers of the stream.
    */
  var viewerCount: js.UndefOr[StreamViewerCount] = js.undefined
}
object StreamSummary {
  
  inline def apply(): StreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamSummary]
  }
  
  extension [Self <: StreamSummary](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    inline def setHealth(value: StreamHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setStartTime(value: StreamStartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: StreamState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setViewerCount(value: StreamViewerCount): Self = StObject.set(x, "viewerCount", value.asInstanceOf[js.Any])
    
    inline def setViewerCountUndefined: Self = StObject.set(x, "viewerCount", js.undefined)
  }
}
