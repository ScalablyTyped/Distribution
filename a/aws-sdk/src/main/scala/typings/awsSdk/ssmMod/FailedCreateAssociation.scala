package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateAssociation extends js.Object {
  /**
    * The association.
    */
  var Entry: js.UndefOr[CreateAssociationBatchRequestEntry] = js.native
  /**
    * The source of the failure.
    */
  var Fault: js.UndefOr[typings.awsSdk.ssmMod.Fault] = js.native
  /**
    * A description of the failure.
    */
  var Message: js.UndefOr[BatchErrorMessage] = js.native
}

object FailedCreateAssociation {
  @scala.inline
  def apply(
    Entry: CreateAssociationBatchRequestEntry = null,
    Fault: Fault = null,
    Message: BatchErrorMessage = null
  ): FailedCreateAssociation = {
    val __obj = js.Dynamic.literal()
    if (Entry != null) __obj.updateDynamic("Entry")(Entry.asInstanceOf[js.Any])
    if (Fault != null) __obj.updateDynamic("Fault")(Fault.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCreateAssociation]
  }
}

