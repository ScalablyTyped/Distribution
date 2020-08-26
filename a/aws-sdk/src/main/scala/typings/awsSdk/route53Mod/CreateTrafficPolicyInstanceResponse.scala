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
  @scala.inline
  implicit class CreateTrafficPolicyInstanceResponseOps[Self <: CreateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
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
    def setTrafficPolicyInstance(value: TrafficPolicyInstance): Self = this.set("TrafficPolicyInstance", value.asInstanceOf[js.Any])
  }
  
}

