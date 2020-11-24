package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class TransferDomainToAnotherAwsAccountRequestOps[Self <: TransferDomainToAnotherAwsAccountRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
}
