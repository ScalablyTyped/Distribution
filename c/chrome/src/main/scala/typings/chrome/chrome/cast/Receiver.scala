package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Receiver extends js.Object {
  
  var capabilities: js.Array[Capability] = js.native
  
  var displayStatus: ReceiverDisplayStatus = js.native
  
  var friendlyName: String = js.native
  
  var label: String = js.native
  
  var receiverType: ReceiverType = js.native
  
  var volume: Volume = js.native
}
object Receiver {
  
  @scala.inline
  def apply(
    capabilities: js.Array[Capability],
    displayStatus: ReceiverDisplayStatus,
    friendlyName: String,
    label: String,
    receiverType: ReceiverType,
    volume: Volume
  ): Receiver = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], displayStatus = displayStatus.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], receiverType = receiverType.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receiver]
  }
  
  @scala.inline
  implicit class ReceiverOps[Self <: Receiver] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: js.Array[Capability]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayStatus(value: ReceiverDisplayStatus): Self = this.set("displayStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiverType(value: ReceiverType): Self = this.set("receiverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Volume): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
}
