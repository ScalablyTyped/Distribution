package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy instance.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  var TrafficPolicyInstance: typings.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}

object CreateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicyInstance: TrafficPolicyInstance): CreateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyInstanceResponse]
  }
}

