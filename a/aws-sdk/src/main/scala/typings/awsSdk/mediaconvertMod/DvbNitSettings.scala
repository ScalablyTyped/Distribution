package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbNitSettings extends js.Object {
  
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: js.UndefOr[integerMin0Max65535] = js.native
  
  /**
    * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: js.UndefOr[stringMin1Max256] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var NitInterval: js.UndefOr[integerMin25Max10000] = js.native
}
object DvbNitSettings {
  
  @scala.inline
  def apply(): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbNitSettings]
  }
  
  @scala.inline
  implicit class DvbNitSettingsOps[Self <: DvbNitSettings] (val x: Self) extends AnyVal {
    
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
    def setNetworkId(value: integerMin0Max65535): Self = this.set("NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkId: Self = this.set("NetworkId", js.undefined)
    
    @scala.inline
    def setNetworkName(value: stringMin1Max256): Self = this.set("NetworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkName: Self = this.set("NetworkName", js.undefined)
    
    @scala.inline
    def setNitInterval(value: integerMin25Max10000): Self = this.set("NitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNitInterval: Self = this.set("NitInterval", js.undefined)
  }
}
