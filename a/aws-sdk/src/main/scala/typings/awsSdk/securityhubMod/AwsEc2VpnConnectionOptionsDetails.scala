package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpnConnectionOptionsDetails extends StObject {
  
  /**
    * Whether the VPN connection uses static routes only.
    */
  var StaticRoutesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPN tunnel options.
    */
  var TunnelOptions: js.UndefOr[AwsEc2VpnConnectionOptionsTunnelOptionsList] = js.undefined
}
object AwsEc2VpnConnectionOptionsDetails {
  
  inline def apply(): AwsEc2VpnConnectionOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpnConnectionOptionsDetails]
  }
  
  extension [Self <: AwsEc2VpnConnectionOptionsDetails](x: Self) {
    
    inline def setStaticRoutesOnly(value: Boolean): Self = StObject.set(x, "StaticRoutesOnly", value.asInstanceOf[js.Any])
    
    inline def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "StaticRoutesOnly", js.undefined)
    
    inline def setTunnelOptions(value: AwsEc2VpnConnectionOptionsTunnelOptionsList): Self = StObject.set(x, "TunnelOptions", value.asInstanceOf[js.Any])
    
    inline def setTunnelOptionsUndefined: Self = StObject.set(x, "TunnelOptions", js.undefined)
    
    inline def setTunnelOptionsVarargs(value: AwsEc2VpnConnectionOptionsTunnelOptionsDetails*): Self = StObject.set(x, "TunnelOptions", js.Array(value*))
  }
}
