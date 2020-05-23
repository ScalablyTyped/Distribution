package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptDomainTransferFromAnotherAwsAccountResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
}

object AcceptDomainTransferFromAnotherAwsAccountResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): AcceptDomainTransferFromAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountResponse]
  }
}

