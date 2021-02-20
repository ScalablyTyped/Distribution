package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbNitSettings extends StObject {
  
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: integerMin0Max65536 = js.native
  
  /**
    * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: stringMin1Max256 = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max10000] = js.native
}
object DvbNitSettings {
  
  @scala.inline
  def apply(NetworkId: integerMin0Max65536, NetworkName: stringMin1Max256): DvbNitSettings = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
  
  @scala.inline
  implicit class DvbNitSettingsMutableBuilder[Self <: DvbNitSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkId(value: integerMin0Max65536): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkName(value: stringMin1Max256): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepInterval(value: integerMin25Max10000): Self = StObject.set(x, "RepInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepIntervalUndefined: Self = StObject.set(x, "RepInterval", js.undefined)
  }
}
