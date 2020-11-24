package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopRequest extends js.Object {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.native
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.native
}
object BatchStopRequest {
  
  @scala.inline
  def apply(): BatchStopRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopRequest]
  }
  
  @scala.inline
  implicit class BatchStopRequestOps[Self <: BatchStopRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelIdsVarargs(value: string*): Self = this.set("ChannelIds", js.Array(value :_*))
    
    @scala.inline
    def setChannelIds(value: listOfString): Self = this.set("ChannelIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelIds: Self = this.set("ChannelIds", js.undefined)
    
    @scala.inline
    def setMultiplexIdsVarargs(value: string*): Self = this.set("MultiplexIds", js.Array(value :_*))
    
    @scala.inline
    def setMultiplexIds(value: listOfString): Self = this.set("MultiplexIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplexIds: Self = this.set("MultiplexIds", js.undefined)
  }
}
