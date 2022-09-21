package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuedMessagesResponse extends StObject {
  
  /**
    * The messages in the downlink queue.
    */
  var DownlinkQueueMessagesList: js.UndefOr[typings.awsSdk.iotwirelessMod.DownlinkQueueMessagesList] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.iotwirelessMod.NextToken] = js.undefined
}
object ListQueuedMessagesResponse {
  
  inline def apply(): ListQueuedMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueuedMessagesResponse]
  }
  
  extension [Self <: ListQueuedMessagesResponse](x: Self) {
    
    inline def setDownlinkQueueMessagesList(value: DownlinkQueueMessagesList): Self = StObject.set(x, "DownlinkQueueMessagesList", value.asInstanceOf[js.Any])
    
    inline def setDownlinkQueueMessagesListUndefined: Self = StObject.set(x, "DownlinkQueueMessagesList", js.undefined)
    
    inline def setDownlinkQueueMessagesListVarargs(value: DownlinkQueueMessage*): Self = StObject.set(x, "DownlinkQueueMessagesList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
