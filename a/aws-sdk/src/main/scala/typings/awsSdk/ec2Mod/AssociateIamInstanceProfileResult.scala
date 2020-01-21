package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateIamInstanceProfileResult extends js.Object {
  /**
    * Information about the IAM instance profile association.
    */
  var IamInstanceProfileAssociation: js.UndefOr[typings.awsSdk.ec2Mod.IamInstanceProfileAssociation] = js.native
}

object AssociateIamInstanceProfileResult {
  @scala.inline
  def apply(IamInstanceProfileAssociation: IamInstanceProfileAssociation = null): AssociateIamInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileAssociation != null) __obj.updateDynamic("IamInstanceProfileAssociation")(IamInstanceProfileAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateIamInstanceProfileResult]
  }
}

