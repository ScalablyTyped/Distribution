package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStartRequest extends StObject {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.undefined
}
object BatchStartRequest {
  
  inline def apply(): BatchStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartRequest]
  }
  
  extension [Self <: BatchStartRequest](x: Self) {
    
    inline def setChannelIds(value: listOfString): Self = StObject.set(x, "ChannelIds", value.asInstanceOf[js.Any])
    
    inline def setChannelIdsUndefined: Self = StObject.set(x, "ChannelIds", js.undefined)
    
    inline def setChannelIdsVarargs(value: string*): Self = StObject.set(x, "ChannelIds", js.Array(value :_*))
    
    inline def setMultiplexIds(value: listOfString): Self = StObject.set(x, "MultiplexIds", value.asInstanceOf[js.Any])
    
    inline def setMultiplexIdsUndefined: Self = StObject.set(x, "MultiplexIds", js.undefined)
    
    inline def setMultiplexIdsVarargs(value: string*): Self = StObject.set(x, "MultiplexIds", js.Array(value :_*))
  }
}
