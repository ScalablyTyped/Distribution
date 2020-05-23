package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferDomainToAnotherAwsAccountResponse extends js.Object {
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
  /**
    * To finish transferring a domain to another AWS account, the account that the domain is being transferred to must submit an AcceptDomainTransferFromAnotherAwsAccount request. The request must include the value of the Password element that was returned in the TransferDomainToAnotherAwsAccount response.
    */
  var Password: js.UndefOr[String] = js.native
}

object TransferDomainToAnotherAwsAccountResponse {
  @scala.inline
  def apply(OperationId: OperationId = null, Password: String = null): TransferDomainToAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainToAnotherAwsAccountResponse]
  }
}

