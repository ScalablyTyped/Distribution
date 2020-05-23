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
}

