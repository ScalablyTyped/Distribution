package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filters extends StObject {
  
  /**
    * The channel to use to filter the metrics.
    */
  var Channels: js.UndefOr[typings.awsSdk.connectMod.Channels] = js.undefined
  
  /**
    * The queues to use to filter the metrics. You should specify at least one queue, and can specify up to 100 queues per request. The GetCurrentMetricsData API in particular requires a queue when you include a Filter in your request. 
    */
  var Queues: js.UndefOr[typings.awsSdk.connectMod.Queues] = js.undefined
}
object Filters {
  
  inline def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  extension [Self <: Filters](x: Self) {
    
    inline def setChannels(value: Channels): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value*))
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: QueueId*): Self = StObject.set(x, "Queues", js.Array(value*))
  }
}
