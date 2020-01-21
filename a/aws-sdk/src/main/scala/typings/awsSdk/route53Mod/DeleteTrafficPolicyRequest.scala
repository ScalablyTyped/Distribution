package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficPolicyRequest extends js.Object {
  /**
    * The ID of the traffic policy that you want to delete.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The version number of the traffic policy that you want to delete.
    */
  var Version: TrafficPolicyVersion = js.native
}

object DeleteTrafficPolicyRequest {
  @scala.inline
  def apply(Id: TrafficPolicyId, Version: TrafficPolicyVersion): DeleteTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTrafficPolicyRequest]
  }
}

