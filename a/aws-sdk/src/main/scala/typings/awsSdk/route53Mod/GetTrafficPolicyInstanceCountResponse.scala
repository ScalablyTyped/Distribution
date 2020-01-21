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
}

