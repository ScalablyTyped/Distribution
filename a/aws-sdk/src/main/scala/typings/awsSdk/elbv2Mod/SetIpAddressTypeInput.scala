package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetIpAddressTypeInput extends js.Object {
  /**
    * The IP address type. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). Internal load balancers must use ipv4. Network Load Balancers must use ipv4.
    */
  var IpAddressType: typings.awsSdk.elbv2Mod.IpAddressType = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn = js.native
}

object SetIpAddressTypeInput {
  @scala.inline
  def apply(IpAddressType: IpAddressType, LoadBalancerArn: LoadBalancerArn): SetIpAddressTypeInput = {
    val __obj = js.Dynamic.literal(IpAddressType = IpAddressType.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIpAddressTypeInput]
  }
  @scala.inline
  implicit class SetIpAddressTypeInputOps[Self <: SetIpAddressTypeInput] (val x: Self) extends AnyVal {
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
    def setIpAddressType(value: IpAddressType): Self = this.set("IpAddressType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerArn(value: LoadBalancerArn): Self = this.set("LoadBalancerArn", value.asInstanceOf[js.Any])
  }
  
}

