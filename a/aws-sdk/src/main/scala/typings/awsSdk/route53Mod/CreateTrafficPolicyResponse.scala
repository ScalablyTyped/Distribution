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
  @scala.inline
  implicit class CreateTrafficPolicyResponseOps[Self <: CreateTrafficPolicyResponse] (val x: Self) extends AnyVal {
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
    def setLocation(value: ResourceURI): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrafficPolicy(value: TrafficPolicy): Self = this.set("TrafficPolicy", value.asInstanceOf[js.Any])
  }
  
}

