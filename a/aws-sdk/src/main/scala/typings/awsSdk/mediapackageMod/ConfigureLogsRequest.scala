package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureLogsRequest extends js.Object {
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.EgressAccessLogs] = js.native
  
  /**
    * The ID of the channel to log subscription.
    */
  var Id: string = js.native
  
  var IngressAccessLogs: js.UndefOr[typings.awsSdk.mediapackageMod.IngressAccessLogs] = js.native
}
object ConfigureLogsRequest {
  
  @scala.inline
  def apply(Id: string): ConfigureLogsRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsRequest]
  }
  
  @scala.inline
  implicit class ConfigureLogsRequestOps[Self <: ConfigureLogsRequest] (val x: Self) extends AnyVal {
    
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressAccessLogs(value: EgressAccessLogs): Self = this.set("EgressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgressAccessLogs: Self = this.set("EgressAccessLogs", js.undefined)
    
    @scala.inline
    def setIngressAccessLogs(value: IngressAccessLogs): Self = this.set("IngressAccessLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressAccessLogs: Self = this.set("IngressAccessLogs", js.undefined)
  }
}
