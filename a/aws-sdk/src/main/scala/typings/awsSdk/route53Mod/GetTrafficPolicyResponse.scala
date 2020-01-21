package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyResponse extends js.Object {
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy = js.native
}

object GetTrafficPolicyResponse {
  @scala.inline
  def apply(TrafficPolicy: TrafficPolicy): GetTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTrafficPolicyResponse]
  }
}

