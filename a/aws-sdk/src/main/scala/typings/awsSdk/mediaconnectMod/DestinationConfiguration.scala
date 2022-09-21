package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfiguration extends StObject {
  
  /**
    * The IP address where contents of the media stream will be sent.
    */
  var DestinationIp: string
  
  /**
    * The port to use when the content of the media stream is distributed to the output.
    */
  var DestinationPort: integer
  
  /**
    * The VPC interface that is used for the media stream associated with the output.
    */
  var Interface: typings.awsSdk.mediaconnectMod.Interface
  
  /**
    * The IP address that the receiver requires in order to establish a connection with the flow. This value is represented by the elastic network interface IP address of the VPC. This field applies only to outputs that use the CDI or ST 2110 JPEG XS protocol.
    */
  var OutboundIp: string
}
object DestinationConfiguration {
  
  inline def apply(DestinationIp: string, DestinationPort: integer, Interface: Interface, OutboundIp: string): DestinationConfiguration = {
    val __obj = js.Dynamic.literal(DestinationIp = DestinationIp.asInstanceOf[js.Any], DestinationPort = DestinationPort.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any], OutboundIp = OutboundIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationConfiguration]
  }
  
  extension [Self <: DestinationConfiguration](x: Self) {
    
    inline def setDestinationIp(value: string): Self = StObject.set(x, "DestinationIp", value.asInstanceOf[js.Any])
    
    inline def setDestinationPort(value: integer): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: Interface): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setOutboundIp(value: string): Self = StObject.set(x, "OutboundIp", value.asInstanceOf[js.Any])
  }
}
