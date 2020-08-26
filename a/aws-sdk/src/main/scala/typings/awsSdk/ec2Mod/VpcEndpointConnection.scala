package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnection extends js.Object {
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.native
  /**
    * The DNS entries for the VPC endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the network load balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the service to which the endpoint is connected.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the VPC endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  var VpcEndpointState: js.UndefOr[State] = js.native
}

object VpcEndpointConnection {
  @scala.inline
  def apply(): VpcEndpointConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnection]
  }
  @scala.inline
  implicit class VpcEndpointConnectionOps[Self <: VpcEndpointConnection] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: MillisecondDateTime): Self = this.set("CreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("CreationTimestamp", js.undefined)
    @scala.inline
    def setDnsEntriesVarargs(value: DnsEntry*): Self = this.set("DnsEntries", js.Array(value :_*))
    @scala.inline
    def setDnsEntries(value: DnsEntrySet): Self = this.set("DnsEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsEntries: Self = this.set("DnsEntries", js.undefined)
    @scala.inline
    def setNetworkLoadBalancerArnsVarargs(value: String*): Self = this.set("NetworkLoadBalancerArns", js.Array(value :_*))
    @scala.inline
    def setNetworkLoadBalancerArns(value: ValueStringList): Self = this.set("NetworkLoadBalancerArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkLoadBalancerArns: Self = this.set("NetworkLoadBalancerArns", js.undefined)
    @scala.inline
    def setServiceId(value: String): Self = this.set("ServiceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceId: Self = this.set("ServiceId", js.undefined)
    @scala.inline
    def setVpcEndpointId(value: String): Self = this.set("VpcEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("VpcEndpointId", js.undefined)
    @scala.inline
    def setVpcEndpointOwner(value: String): Self = this.set("VpcEndpointOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointOwner: Self = this.set("VpcEndpointOwner", js.undefined)
    @scala.inline
    def setVpcEndpointState(value: State): Self = this.set("VpcEndpointState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointState: Self = this.set("VpcEndpointState", js.undefined)
  }
  
}

