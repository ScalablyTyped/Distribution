package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferDomainToAnotherAwsAccountRequest extends js.Object {
  /**
    * The account ID of the AWS account that you want to transfer the domain to, for example, 111122223333.
    */
  var AccountId: typings.awsSdk.route53domainsMod.AccountId = js.native
  /**
    * The name of the domain that you want to transfer from the current AWS account to another account.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
}

object TransferDomainToAnotherAwsAccountRequest {
  @scala.inline
  def apply(AccountId: AccountId, DomainName: DomainName): TransferDomainToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainToAnotherAwsAccountRequest]
  }
}

