package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetSubnetsOutput extends js.Object {
  
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
  implicit class SetSubnetsOutputOps[Self <: SetSubnetsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setIpAddressType(value: IpAddressType): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddressType: Self = this.set("IpAddressType", js.undefined)
  }
}
