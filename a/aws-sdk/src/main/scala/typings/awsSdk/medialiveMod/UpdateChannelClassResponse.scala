package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateChannelClassResponse extends js.Object {
  
  var Channel: js.UndefOr[typings.awsSdk.medialiveMod.Channel] = js.native
}
object UpdateChannelClassResponse {
  
  @scala.inline
  def apply(): UpdateChannelClassResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelClassResponse]
  }
  
  @scala.inline
  implicit class UpdateChannelClassResponseOps[Self <: UpdateChannelClassResponse] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("Channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("Channel", js.undefined)
  }
}
