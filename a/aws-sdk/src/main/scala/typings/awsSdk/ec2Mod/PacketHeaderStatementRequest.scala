package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketHeaderStatementRequest extends StObject {
  
  /**
    * The destination addresses.
    */
  var DestinationAddresses: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The destination ports.
    */
  var DestinationPorts: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The destination prefix lists.
    */
  var DestinationPrefixLists: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The protocols.
    */
  var Protocols: js.UndefOr[ProtocolList] = js.undefined
  
  /**
    * The source addresses.
    */
  var SourceAddresses: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The source ports.
    */
  var SourcePorts: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The source prefix lists.
    */
  var SourcePrefixLists: js.UndefOr[ValueStringList] = js.undefined
}
object PacketHeaderStatementRequest {
  
  inline def apply(): PacketHeaderStatementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PacketHeaderStatementRequest]
  }
  
  extension [Self <: PacketHeaderStatementRequest](x: Self) {
    
    inline def setDestinationAddresses(value: ValueStringList): Self = StObject.set(x, "DestinationAddresses", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressesUndefined: Self = StObject.set(x, "DestinationAddresses", js.undefined)
    
    inline def setDestinationAddressesVarargs(value: String*): Self = StObject.set(x, "DestinationAddresses", js.Array(value*))
    
    inline def setDestinationPorts(value: ValueStringList): Self = StObject.set(x, "DestinationPorts", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortsUndefined: Self = StObject.set(x, "DestinationPorts", js.undefined)
    
    inline def setDestinationPortsVarargs(value: String*): Self = StObject.set(x, "DestinationPorts", js.Array(value*))
    
    inline def setDestinationPrefixLists(value: ValueStringList): Self = StObject.set(x, "DestinationPrefixLists", value.asInstanceOf[js.Any])
    
    inline def setDestinationPrefixListsUndefined: Self = StObject.set(x, "DestinationPrefixLists", js.undefined)
    
    inline def setDestinationPrefixListsVarargs(value: String*): Self = StObject.set(x, "DestinationPrefixLists", js.Array(value*))
    
    inline def setProtocols(value: ProtocolList): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setSourceAddresses(value: ValueStringList): Self = StObject.set(x, "SourceAddresses", value.asInstanceOf[js.Any])
    
    inline def setSourceAddressesUndefined: Self = StObject.set(x, "SourceAddresses", js.undefined)
    
    inline def setSourceAddressesVarargs(value: String*): Self = StObject.set(x, "SourceAddresses", js.Array(value*))
    
    inline def setSourcePorts(value: ValueStringList): Self = StObject.set(x, "SourcePorts", value.asInstanceOf[js.Any])
    
    inline def setSourcePortsUndefined: Self = StObject.set(x, "SourcePorts", js.undefined)
    
    inline def setSourcePortsVarargs(value: String*): Self = StObject.set(x, "SourcePorts", js.Array(value*))
    
    inline def setSourcePrefixLists(value: ValueStringList): Self = StObject.set(x, "SourcePrefixLists", value.asInstanceOf[js.Any])
    
    inline def setSourcePrefixListsUndefined: Self = StObject.set(x, "SourcePrefixLists", js.undefined)
    
    inline def setSourcePrefixListsVarargs(value: String*): Self = StObject.set(x, "SourcePrefixLists", js.Array(value*))
  }
}
