package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains settings for the new traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy = js.native
}

object CreateTrafficPolicyResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyResponse]
  }
}

