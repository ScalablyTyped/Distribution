package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticLoadBalancer extends js.Object {
  /**
    * A list of Availability Zones.
    */
  var AvailabilityZones: js.UndefOr[Strings] = js.native
  /**
    * The instance's public DNS name.
    */
  var DnsName: js.UndefOr[String] = js.native
  /**
    * A list of the EC2 instances that the Elastic Load Balancing instance is managing traffic for.
    */
  var Ec2InstanceIds: js.UndefOr[Strings] = js.native
  /**
    * The Elastic Load Balancing instance's name.
    */
  var ElasticLoadBalancerName: js.UndefOr[String] = js.native
  /**
    * The ID of the layer that the instance is attached to.
    */
  var LayerId: js.UndefOr[String] = js.native
  /**
    * The instance's AWS region.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the stack that the instance is associated with.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * A list of subnet IDs, if the stack is running in a VPC.
    */
  var SubnetIds: js.UndefOr[Strings] = js.native
  /**
    * The VPC ID.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object ElasticLoadBalancer {
  @scala.inline
  def apply(): ElasticLoadBalancer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticLoadBalancer]
  }
  @scala.inline
  implicit class ElasticLoadBalancerOps[Self <: ElasticLoadBalancer] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: String*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: Strings): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDnsName(value: String): Self = this.set("DnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsName: Self = this.set("DnsName", js.undefined)
    @scala.inline
    def setEc2InstanceIdsVarargs(value: String*): Self = this.set("Ec2InstanceIds", js.Array(value :_*))
    @scala.inline
    def setEc2InstanceIds(value: Strings): Self = this.set("Ec2InstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2InstanceIds: Self = this.set("Ec2InstanceIds", js.undefined)
    @scala.inline
    def setElasticLoadBalancerName(value: String): Self = this.set("ElasticLoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticLoadBalancerName: Self = this.set("ElasticLoadBalancerName", js.undefined)
    @scala.inline
    def setLayerId(value: String): Self = this.set("LayerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("LayerId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Strings): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

