package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbNitSettings extends StObject {
  
  /**
    * The numeric value placed in the Network Information Table (NIT).
    */
  var NetworkId: integerMin0Max65536
  
  /**
    * The network name text placed in the networkNameDescriptor inside the Network Information Table. Maximum length is 256 characters.
    */
  var NetworkName: stringMin1Max256
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max10000] = js.undefined
}
object DvbNitSettings {
  
  inline def apply(NetworkId: integerMin0Max65536, NetworkName: stringMin1Max256): DvbNitSettings = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any], NetworkName = NetworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbNitSettings]
  }
  
  extension [Self <: DvbNitSettings](x: Self) {
    
    inline def setNetworkId(value: integerMin0Max65536): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkName(value: stringMin1Max256): Self = StObject.set(x, "NetworkName", value.asInstanceOf[js.Any])
    
    inline def setRepInterval(value: integerMin25Max10000): Self = StObject.set(x, "RepInterval", value.asInstanceOf[js.Any])
    
    inline def setRepIntervalUndefined: Self = StObject.set(x, "RepInterval", js.undefined)
  }
}
