package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssociationStatusRequest extends js.Object {
  /**
    * The association status.
    */
  var AssociationStatus: typings.awsSdk.ssmMod.AssociationStatus = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: DocumentARN = js.native
}

object UpdateAssociationStatusRequest {
  @scala.inline
  def apply(AssociationStatus: AssociationStatus, InstanceId: InstanceId, Name: DocumentARN): UpdateAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(AssociationStatus = AssociationStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationStatusRequest]
  }
}

