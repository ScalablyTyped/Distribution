package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEgressEndpoint extends js.Object {
  
  /**
    * Public IP of where a channel's output comes from
    */
  var SourceIp: js.UndefOr[string] = js.native
}
object ChannelEgressEndpoint {
  
  @scala.inline
  def apply(): ChannelEgressEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEgressEndpoint]
  }
  
  @scala.inline
  implicit class ChannelEgressEndpointOps[Self <: ChannelEgressEndpoint] (val x: Self) extends AnyVal {
    
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
    def setSourceIp(value: string): Self = this.set("SourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceIp: Self = this.set("SourceIp", js.undefined)
  }
}
