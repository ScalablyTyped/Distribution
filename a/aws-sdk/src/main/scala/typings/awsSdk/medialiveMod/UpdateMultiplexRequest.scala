package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMultiplexRequest extends js.Object {
  
  /**
    * ID of the multiplex to update.
    */
  var MultiplexId: string = js.native
  
  /**
    * The new settings for a multiplex.
    */
  var MultiplexSettings: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexSettings] = js.native
  
  /**
    * Name of the multiplex.
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateMultiplexRequest {
  
  @scala.inline
  def apply(MultiplexId: string): UpdateMultiplexRequest = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMultiplexRequest]
  }
  
  @scala.inline
  implicit class UpdateMultiplexRequestOps[Self <: UpdateMultiplexRequest] (val x: Self) extends AnyVal {
    
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
    def setMultiplexId(value: string): Self = this.set("MultiplexId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexSettings(value: MultiplexSettings): Self = this.set("MultiplexSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplexSettings: Self = this.set("MultiplexSettings", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
