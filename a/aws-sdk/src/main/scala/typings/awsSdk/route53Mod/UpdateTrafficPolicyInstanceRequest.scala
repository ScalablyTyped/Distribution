package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to update.
    */
  var Id: TrafficPolicyInstanceId = js.native
  /**
    * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
    */
  var TTL: typings.awsSdk.route53Mod.TTL = js.native
  /**
    * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyId: typings.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyVersion: typings.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object UpdateTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(
    Id: TrafficPolicyInstanceId,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): UpdateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceRequest]
  }
  @scala.inline
  implicit class UpdateTrafficPolicyInstanceRequestOps[Self <: UpdateTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
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
    def setId(value: TrafficPolicyInstanceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTTL(value: TTL): Self = this.set("TTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyId(value: TrafficPolicyId): Self = this.set("TrafficPolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicyVersion(value: TrafficPolicyVersion): Self = this.set("TrafficPolicyVersion", value.asInstanceOf[js.Any])
  }
  
}

