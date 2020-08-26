package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyInstanceCountResponse extends js.Object {
  /**
    * The number of traffic policy instances that are associated with the current AWS account.
    */
  var TrafficPolicyInstanceCount: typings.awsSdk.route53Mod.TrafficPolicyInstanceCount = js.native
}

object GetTrafficPolicyInstanceCountResponse {
  @scala.inline
  def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
  @scala.inline
  implicit class GetTrafficPolicyInstanceCountResponseOps[Self <: GetTrafficPolicyInstanceCountResponse] (val x: Self) extends AnyVal {
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
    def setTrafficPolicyInstanceCount(value: TrafficPolicyInstanceCount): Self = this.set("TrafficPolicyInstanceCount", value.asInstanceOf[js.Any])
  }
  
}

