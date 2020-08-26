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
  def apply(): GetOperationDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOperationDetailResponse]
  }
  @scala.inline
  implicit class GetOperationDetailResponseOps[Self <: GetOperationDetailResponse] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setMessage(value: ErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setOperationId(value: OperationId): Self = this.set("OperationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("OperationId", js.undefined)
    @scala.inline
    def setStatus(value: OperationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubmittedDate(value: Timestamp): Self = this.set("SubmittedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedDate: Self = this.set("SubmittedDate", js.undefined)
    @scala.inline
    def setType(value: OperationType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

