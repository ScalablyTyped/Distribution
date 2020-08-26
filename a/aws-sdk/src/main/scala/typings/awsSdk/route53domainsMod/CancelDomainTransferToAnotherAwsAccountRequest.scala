package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDomainTransferToAnotherAwsAccountRequest extends js.Object {
  /**
    * The name of the domain for which you want to cancel the transfer to another AWS account.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object CancelDomainTransferToAnotherAwsAccountRequest {
  @scala.inline
  def apply(DomainName: DomainName): CancelDomainTransferToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDomainTransferToAnotherAwsAccountRequest]
  }
  @scala.inline
  implicit class CancelDomainTransferToAnotherAwsAccountRequestOps[Self <: CancelDomainTransferToAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
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
  }
  
}

