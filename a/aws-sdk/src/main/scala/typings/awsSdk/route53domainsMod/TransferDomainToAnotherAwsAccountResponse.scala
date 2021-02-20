package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferDomainToAnotherAwsAccountResponse extends StObject {
  
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
  def apply(): TransferDomainToAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferDomainToAnotherAwsAccountResponse]
  }
  
  @scala.inline
  implicit class TransferDomainToAnotherAwsAccountResponseMutableBuilder[Self <: TransferDomainToAnotherAwsAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
  }
}
