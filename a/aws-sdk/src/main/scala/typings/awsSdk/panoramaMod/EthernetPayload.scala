package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthernetPayload extends StObject {
  
  /**
    * How the device gets an IP address.
    */
  var ConnectionType: typings.awsSdk.panoramaMod.ConnectionType
  
  /**
    * Network configuration for a static IP connection.
    */
  var StaticIpConnectionInfo: js.UndefOr[typings.awsSdk.panoramaMod.StaticIpConnectionInfo] = js.undefined
}
object EthernetPayload {
  
  inline def apply(ConnectionType: ConnectionType): EthernetPayload = {
    val __obj = js.Dynamic.literal(ConnectionType = ConnectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthernetPayload]
  }
  
  extension [Self <: EthernetPayload](x: Self) {
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    inline def setStaticIpConnectionInfo(value: StaticIpConnectionInfo): Self = StObject.set(x, "StaticIpConnectionInfo", value.asInstanceOf[js.Any])
    
    inline def setStaticIpConnectionInfoUndefined: Self = StObject.set(x, "StaticIpConnectionInfo", js.undefined)
  }
}
