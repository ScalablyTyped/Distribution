package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOperationDetailResponse extends js.Object {
  /**
    * The name of a domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.route53domainsMod.DomainName] = js.native
  /**
    * Detailed information on the status including possible errors.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
  /**
    * The identifier for the operation.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
  /**
    * The current status of the requested operation in the system.
    */
  var Status: js.UndefOr[OperationStatus] = js.native
  /**
    * The date when the request was submitted.
    */
  var SubmittedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The type of operation that was requested.
    */
  var Type: js.UndefOr[OperationType] = js.native
}

object GetOperationDetailResponse {
  @scala.inline
  def apply(
    DomainName: DomainName = null,
    Message: ErrorMessage = null,
    OperationId: OperationId = null,
    Status: OperationStatus = null,
    SubmittedDate: Timestamp = null,
    Type: OperationType = null
  ): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmittedDate != null) __obj.updateDynamic("SubmittedDate")(SubmittedDate.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
}

