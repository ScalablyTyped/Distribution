package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSubnetsOutput extends StObject {
  
  /**
    * Information about the subnets.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbv2Mod.AvailabilityZones] = js.native
  
  /**
    * [Network Load Balancers] The IP address type.
    */
  var IpAddressType: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddressType] = js.native
}
object SetSubnetsOutput {
  
  @scala.inline
  def apply(): SetSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSubnetsOutput]
  }
  
  @scala.inline
  implicit class SetSubnetsOutputMutableBuilder[Self <: SetSubnetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressTypeUndefined: Self = StObject.set(x, "IpAddressType", js.undefined)
  }
}
