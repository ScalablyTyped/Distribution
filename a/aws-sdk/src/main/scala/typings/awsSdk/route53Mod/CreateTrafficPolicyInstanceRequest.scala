package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want Amazon Route 53 to create resource record sets in by using the configuration in a traffic policy.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The domain name (such as example.com) or subdomain name (such as www.example.com) for which Amazon Route 53 responds to DNS queries by using the resource record sets that Route 53 creates for this traffic policy instance.
    */
  var Name: DNSName = js.native
  /**
    * (Optional) The TTL that you want Amazon Route 53 to assign to all of the resource record sets that it creates in the specified hosted zone.
    */
  var TTL: typings.awsSdk.route53Mod.TTL = js.native
  /**
    * The ID of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyId: typings.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * The version of the traffic policy that you want to use to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyVersion: typings.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object CreateTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(
    HostedZoneId: ResourceId,
    Name: DNSName,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): CreateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyInstanceRequest]
  }
  @scala.inline
  implicit class CreateTrafficPolicyInstanceRequestOps[Self <: CreateTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostedZoneId(value: ResourceId): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: DNSName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTTL(value: TTL): Self = this.set("TTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyId(value: TrafficPolicyId): Self = this.set("TrafficPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = this.set("TrafficPolicyVersion", value.asInstanceOf[js.Any])
  }
  
}

