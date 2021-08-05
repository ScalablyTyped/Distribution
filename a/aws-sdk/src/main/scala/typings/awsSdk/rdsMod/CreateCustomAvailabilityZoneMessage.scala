package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomAvailabilityZoneMessage extends StObject {
  
  /**
    * The name of the custom Availability Zone (AZ).
    */
  var CustomAvailabilityZoneName: String
  
  /**
    * The ID of an existing virtual private network (VPN) between the Amazon RDS website and the VMware vSphere cluster.
    */
  var ExistingVpnId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a new VPN tunnel between the Amazon RDS website and the VMware vSphere cluster. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var NewVpnTunnelName: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic. Specify this parameter only if ExistingVpnId isn't specified.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.undefined
}
object CreateCustomAvailabilityZoneMessage {
  
  inline def apply(CustomAvailabilityZoneName: String): CreateCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneName = CustomAvailabilityZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomAvailabilityZoneMessage]
  }
  
  extension [Self <: CreateCustomAvailabilityZoneMessage](x: Self) {
    
    inline def setCustomAvailabilityZoneName(value: String): Self = StObject.set(x, "CustomAvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setExistingVpnId(value: String): Self = StObject.set(x, "ExistingVpnId", value.asInstanceOf[js.Any])
    
    inline def setExistingVpnIdUndefined: Self = StObject.set(x, "ExistingVpnId", js.undefined)
    
    inline def setNewVpnTunnelName(value: String): Self = StObject.set(x, "NewVpnTunnelName", value.asInstanceOf[js.Any])
    
    inline def setNewVpnTunnelNameUndefined: Self = StObject.set(x, "NewVpnTunnelName", js.undefined)
    
    inline def setVpnTunnelOriginatorIP(value: String): Self = StObject.set(x, "VpnTunnelOriginatorIP", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelOriginatorIPUndefined: Self = StObject.set(x, "VpnTunnelOriginatorIP", js.undefined)
  }
}
