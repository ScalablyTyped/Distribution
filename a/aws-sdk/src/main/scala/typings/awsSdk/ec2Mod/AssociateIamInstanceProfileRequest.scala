package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateIamInstanceProfileRequest extends js.Object {
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object AssociateIamInstanceProfileRequest {
  @scala.inline
  def apply(IamInstanceProfile: IamInstanceProfileSpecification, InstanceId: InstanceId): AssociateIamInstanceProfileRequest = {
    val __obj = js.Dynamic.literal(IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateIamInstanceProfileRequest]
  }
}

