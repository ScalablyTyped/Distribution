package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateQualificationWithWorkerRequest extends js.Object {
  /**
    * The value of the Qualification to assign.
    */
  var IntegerValue: js.UndefOr[Integer] = js.native
  /**
    * The ID of the Qualification type to use for the assigned Qualification.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    *  Specifies whether to send a notification email message to the Worker saying that the qualification was assigned to the Worker. Note: this is true by default. 
    */
  var SendNotification: js.UndefOr[Boolean] = js.native
  /**
    *  The ID of the Worker to whom the Qualification is being assigned. Worker IDs are included with submitted HIT assignments and Qualification requests. 
    */
  var WorkerId: CustomerId = js.native
}

object AssociateQualificationWithWorkerRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    WorkerId: CustomerId,
    IntegerValue: js.UndefOr[Integer] = js.undefined,
    SendNotification: js.UndefOr[Boolean] = js.undefined
  ): AssociateQualificationWithWorkerRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    if (!js.isUndefined(IntegerValue)) __obj.updateDynamic("IntegerValue")(IntegerValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SendNotification)) __obj.updateDynamic("SendNotification")(SendNotification.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateQualificationWithWorkerRequest]
  }
}

