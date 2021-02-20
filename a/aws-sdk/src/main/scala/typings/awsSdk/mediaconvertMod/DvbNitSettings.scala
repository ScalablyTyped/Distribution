package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbNitSettings extends StObject {
  
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
  implicit class DvbNitSettingsMutableBuilder[Self <: DvbNitSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: integerMin0Max65535): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    @scala.inline
    def setNetworkName(value: stringMin1Max256): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkNameUndefined: Self = StObject.set(x, "NetworkName", js.undefined)
    
    @scala.inline
    def setNitInterval(value: integerMin25Max10000): Self = StObject.set(x, "NitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNitIntervalUndefined: Self = StObject.set(x, "NitInterval", js.undefined)
  }
}
