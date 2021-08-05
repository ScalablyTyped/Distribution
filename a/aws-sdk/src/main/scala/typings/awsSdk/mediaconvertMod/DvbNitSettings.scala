package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbNitSettings extends StObject {
  
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: js.UndefOr[integerMin0Max65535] = js.undefined
  
  /**
    * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: js.UndefOr[stringMin1Max256] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var NitInterval: js.UndefOr[integerMin25Max10000] = js.undefined
}
object DvbNitSettings {
  
  inline def apply(): DvbNitSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbNitSettings]
  }
  
  extension [Self <: DvbNitSettings](x: Self) {
    
    inline def setNetworkId(value: integerMin0Max65535): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    inline def setNetworkName(value: stringMin1Max256): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setNetworkNameUndefined: Self = StObject.set(x, "NetworkName", js.undefined)
    
    inline def setNitInterval(value: integerMin25Max10000): Self = StObject.set(x, "NitInterval", value.asInstanceOf[js.Any])
    
    inline def setNitIntervalUndefined: Self = StObject.set(x, "NitInterval", js.undefined)
  }
}
