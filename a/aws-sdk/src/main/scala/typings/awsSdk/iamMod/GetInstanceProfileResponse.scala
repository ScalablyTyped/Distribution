package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileResponse extends js.Object {
  /**
    * A structure containing details about the instance profile.
    */
  var InstanceProfile: typings.awsSdk.iamMod.InstanceProfile = js.native
}

object GetInstanceProfileResponse {
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): GetInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceProfileResponse]
  }
}

