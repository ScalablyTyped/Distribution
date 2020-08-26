package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectDomainTransferFromAnotherAwsAccountResponse extends js.Object {
  /**
    * The identifier that TransferDomainToAnotherAwsAccount returned to track the progress of the request. Because the transfer request was rejected, the value is no longer valid, and you can't use GetOperationDetail to query the operation status.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
}

object RejectDomainTransferFromAnotherAwsAccountResponse {
  @scala.inline
  def apply(): RejectDomainTransferFromAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountResponse]
  }
  @scala.inline
  implicit class RejectDomainTransferFromAnotherAwsAccountResponseOps[Self <: RejectDomainTransferFromAnotherAwsAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationId(value: OperationId): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
  }
  
}

