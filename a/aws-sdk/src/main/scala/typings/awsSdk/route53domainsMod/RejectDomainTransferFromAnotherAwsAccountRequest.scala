package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectDomainTransferFromAnotherAwsAccountRequest extends js.Object {
  /**
    * The name of the domain that was specified when another AWS account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object RejectDomainTransferFromAnotherAwsAccountRequest {
  @scala.inline
  def apply(DomainName: DomainName): RejectDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectDomainTransferFromAnotherAwsAccountRequest]
  }
}

