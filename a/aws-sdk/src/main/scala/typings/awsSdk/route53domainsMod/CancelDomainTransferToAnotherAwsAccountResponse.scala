package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDomainTransferToAnotherAwsAccountResponse extends js.Object {
  /**
    * The identifier that TransferDomainToAnotherAwsAccount returned to track the progress of the request. Because the transfer request was canceled, the value is no longer valid, and you can't use GetOperationDetail to query the operation status.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
}

object CancelDomainTransferToAnotherAwsAccountResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): CancelDomainTransferToAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountResponse]
  }
}

