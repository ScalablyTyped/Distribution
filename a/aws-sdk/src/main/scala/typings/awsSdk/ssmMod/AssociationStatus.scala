package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationStatus extends js.Object {
  /**
    * A user-defined string.
    */
  var AdditionalInfo: js.UndefOr[StatusAdditionalInfo] = js.native
  /**
    * The date when the status changed.
    */
  var Date: DateTime = js.native
  /**
    * The reason for the status.
    */
  var Message: StatusMessage = js.native
  /**
    * The status.
    */
  var Name: AssociationStatusName = js.native
}

object AssociationStatus {
  @scala.inline
  def apply(
    Date: DateTime,
    Message: StatusMessage,
    Name: AssociationStatusName,
    AdditionalInfo: StatusAdditionalInfo = null
  ): AssociationStatus = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationStatus]
  }
}

