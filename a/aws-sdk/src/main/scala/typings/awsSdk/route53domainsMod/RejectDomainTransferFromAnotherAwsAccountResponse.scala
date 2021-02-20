package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectDomainTransferFromAnotherAwsAccountResponse extends StObject {
  
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
  implicit class RejectDomainTransferFromAnotherAwsAccountResponseMutableBuilder[Self <: RejectDomainTransferFromAnotherAwsAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
