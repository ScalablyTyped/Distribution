package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptDomainTransferFromAnotherAwsAccountResponse extends StObject {
  
  /**
    * Identifier for tracking the progress of the request. To query the operation status, use GetOperationDetail.
    */
  var OperationId: js.UndefOr[typings.awsSdk.route53domainsMod.OperationId] = js.native
}
object AcceptDomainTransferFromAnotherAwsAccountResponse {
  
  @scala.inline
  def apply(): AcceptDomainTransferFromAnotherAwsAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptDomainTransferFromAnotherAwsAccountResponse]
  }
  
  @scala.inline
  implicit class AcceptDomainTransferFromAnotherAwsAccountResponseMutableBuilder[Self <: AcceptDomainTransferFromAnotherAwsAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: OperationId): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
  }
}
