package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceIamInstanceProfileAssociationRequest extends js.Object {
  /**
    * The ID of the existing IAM instance profile association.
    */
  var AssociationId: IamInstanceProfileAssociationId = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: IamInstanceProfileSpecification = js.native
}

object ReplaceIamInstanceProfileAssociationRequest {
  @scala.inline
  def apply(
    AssociationId: IamInstanceProfileAssociationId,
    IamInstanceProfile: IamInstanceProfileSpecification
  ): ReplaceIamInstanceProfileAssociationRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], IamInstanceProfile = IamInstanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceIamInstanceProfileAssociationRequest]
  }
}

