package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filters extends js.Object {
  
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
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = this.set("Channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: Channels): Self = this.set("Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    
    @scala.inline
    def setQueuesVarargs(value: QueueId*): Self = this.set("Queues", js.Array(value :_*))
    
    @scala.inline
    def setQueues(value: Queues): Self = this.set("Queues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueues: Self = this.set("Queues", js.undefined)
  }
}
