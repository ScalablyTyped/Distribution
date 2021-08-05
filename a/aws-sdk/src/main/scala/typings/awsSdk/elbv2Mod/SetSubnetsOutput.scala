package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSubnetsOutput extends StObject {
  
  /**
    * Information about the subnets.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbv2Mod.AvailabilityZones] = js.undefined
  
  /**
    * [Network Load Balancers] The IP address type.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddressType] = js.undefined
}
object SetSubnetsOutput {
  
  inline def apply(): SetSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSubnetsOutput]
  }
  
  extension [Self <: SetSubnetsOutput](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
  }
}
