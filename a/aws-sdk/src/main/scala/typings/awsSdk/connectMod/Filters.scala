package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends StObject {
  
  /**
    * The channel to use to filter the metrics.
    */
  var Channels: js.UndefOr[typings.awsSdk.connectMod.Channels] = js.native
  
  /**
    * The queues to use to filter the metrics. You can specify up to 100 queues per request.
    */
  var Queues: js.UndefOr[typings.awsSdk.connectMod.Queues] = js.native
}
object Filters {
  
  @scala.inline
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  
  @scala.inline
  implicit class FiltersMutableBuilder[Self <: Filters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Channels): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: QueueId*): Self = StObject.set(x, "Queues", js.Array(value :_*))
  }
}
