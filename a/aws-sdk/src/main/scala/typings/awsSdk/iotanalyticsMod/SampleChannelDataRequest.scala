package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleChannelDataRequest extends StObject {
  
  /**
    * The name of the channel whose message samples are retrieved.
    */
  var channelName: ChannelName
  
  /**
    * The end of the time window from which sample messages are retrieved.
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  
  /**
    * The number of sample messages to be retrieved. The limit is 10. The default is also 10.
    */
  var maxMessages: js.UndefOr[MaxMessages] = js.undefined
  
  /**
    * The start of the time window from which sample messages are retrieved.
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}
object SampleChannelDataRequest {
  
  inline def apply(channelName: ChannelName): SampleChannelDataRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleChannelDataRequest]
  }
  
  extension [Self <: SampleChannelDataRequest](x: Self) {
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMaxMessages(value: MaxMessages): Self = StObject.set(x, "maxMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxMessagesUndefined: Self = StObject.set(x, "maxMessages", js.undefined)
    
    inline def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
