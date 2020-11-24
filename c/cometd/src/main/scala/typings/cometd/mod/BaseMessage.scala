package typings.cometd.mod

import typings.cometd.anon.Hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseMessage extends Message {
  
  var advice: js.UndefOr[Hosts] = js.native
  
  var channel: String = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var connectionType: js.UndefOr[ConnectionType] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var ext: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var minimumVersion: js.UndefOr[String] = js.native
  
  var successful: Boolean = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object BaseMessage {
  
  @scala.inline
  def apply(channel: String, successful: Boolean): BaseMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMessage]
  }
  
  @scala.inline
  implicit class BaseMessageOps[Self <: BaseMessage] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessful(value: Boolean): Self = this.set("successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvice(value: Hosts): Self = this.set("advice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvice: Self = this.set("advice", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExt(value: js.Any): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setMinimumVersion(value: String): Self = this.set("minimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumVersion: Self = this.set("minimumVersion", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
