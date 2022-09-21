package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprovisionPublicIpv4PoolCidrResult extends StObject {
  
  /**
    * The deprovisioned CIDRs.
    */
  var DeprovisionedAddresses: js.UndefOr[DeprovisionedAddressSet] = js.undefined
  
  /**
    * The ID of the pool that you deprovisioned the CIDR from.
    */
  var PoolId: js.UndefOr[Ipv4PoolEc2Id] = js.undefined
}
object DeprovisionPublicIpv4PoolCidrResult {
  
  inline def apply(): DeprovisionPublicIpv4PoolCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionPublicIpv4PoolCidrResult]
  }
  
  extension [Self <: DeprovisionPublicIpv4PoolCidrResult](x: Self) {
    
    inline def setDeprovisionedAddresses(value: DeprovisionedAddressSet): Self = StObject.set(x, "DeprovisionedAddresses", value.asInstanceOf[js.Any])
    
    inline def setDeprovisionedAddressesUndefined: Self = StObject.set(x, "DeprovisionedAddresses", js.undefined)
    
    inline def setDeprovisionedAddressesVarargs(value: String*): Self = StObject.set(x, "DeprovisionedAddresses", js.Array(value*))
    
    inline def setPoolId(value: Ipv4PoolEc2Id): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
  }
}
