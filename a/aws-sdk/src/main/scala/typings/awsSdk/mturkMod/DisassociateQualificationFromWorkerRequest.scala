package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateQualificationFromWorkerRequest extends js.Object {
  /**
    * The ID of the Qualification type of the Qualification to be revoked.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    * A text message that explains why the Qualification was revoked. The user who had the Qualification sees this message.
    */
  var Reason: js.UndefOr[String] = js.native
  /**
    * The ID of the Worker who possesses the Qualification to be revoked.
    */
  var WorkerId: CustomerId = js.native
}

object DisassociateQualificationFromWorkerRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId, Reason: String = null): DisassociateQualificationFromWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateQualificationFromWorkerRequest]
  }
}

