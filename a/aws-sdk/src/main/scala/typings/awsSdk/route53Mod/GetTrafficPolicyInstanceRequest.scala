package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to get information about.
    */
  var Id: TrafficPolicyInstanceId = js.native
}

object GetTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): GetTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceRequest]
  }
}

