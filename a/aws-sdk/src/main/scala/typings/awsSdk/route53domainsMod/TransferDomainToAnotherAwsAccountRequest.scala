package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferDomainToAnotherAwsAccountRequest extends StObject {
  
  /**
    * The account ID of the Amazon Web Services account that you want to transfer the domain to, for example, 111122223333.
    */
  var AccountId: typings.awsSdk.route53domainsMod.AccountId
  
  /**
    * The name of the domain that you want to transfer from the current Amazon Web Services account to another account.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object TransferDomainToAnotherAwsAccountRequest {
  
  inline def apply(AccountId: AccountId, DomainName: DomainName): TransferDomainToAnotherAwsAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferDomainToAnotherAwsAccountRequest]
  }
  
  extension [Self <: TransferDomainToAnotherAwsAccountRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
