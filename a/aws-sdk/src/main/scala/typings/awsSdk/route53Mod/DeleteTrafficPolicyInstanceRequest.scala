package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to delete.   When you delete a traffic policy instance, Amazon Route 53 also deletes all of the resource record sets that were created when you created the traffic policy instance. 
    */
  var Id: TrafficPolicyInstanceId = js.native
}

object DeleteTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(Id: TrafficPolicyInstanceId): DeleteTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficPolicyInstanceRequest]
  }
}

