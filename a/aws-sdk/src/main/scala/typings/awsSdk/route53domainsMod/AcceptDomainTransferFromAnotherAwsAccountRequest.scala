package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptDomainTransferFromAnotherAwsAccountRequest extends js.Object {
  /**
    * The name of the domain that was specified when another AWS account submitted a TransferDomainToAnotherAwsAccount request. 
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  /**
    * The password that was returned by the TransferDomainToAnotherAwsAccount request. 
    */
  var Password: String = js.native
}

object AcceptDomainTransferFromAnotherAwsAccountRequest {
  @scala.inline
  def apply(DomainName: DomainName, Password: String): AcceptDomainTransferFromAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountRequest]
  }
}

